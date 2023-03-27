package TextConverter;

import java.util.HashMap;


public class Parser {

    private static final int NOTE = 0;
    private static final int REPEAT = 1;
    private static final int VOLUME = 2;
    private static final int OCTAVE = 3;
    private static final int DIGIT = 4;
    private static final int INSTRUMENT = 5;
    private static final int BLANK = 6;

    private static final HashMap<Character, Integer> instrumentMap = new HashMap<>();

    // Constructor
    public Parser() {
        for (int i = 0; i < 10; i++) {
            instrumentMap.put(Constants.INSTRUMENT_CHARACTERS[i], Constants.INSTRUMENT_INDEX[i]);
        }
    }
   
    // Converts the raw input from the user to a comprehensive String for JFugue Player
    public String convertMelody(String rawText) {

        String previousNote = "r";
        // Starts the string with the default settings for the melody 
        String finalString = 
            Constants.JF_INSTRUMENT + Constants.DEFAULT_INSTRUMENT + " " +
            Constants.JF_TEMPO + Constants.DEFAULT_TEMPO + " " +
            Constants.JF_VOLUME + Constants.DEFAULT_VOLUME + ") ";

        int currentVolume = Constants.DEFAULT_VOLUME;
        int currentOctave = Constants.DEFAULT_OCTAVE;
        int currentInstrument = Constants.DEFAULT_INSTRUMENT;
        // Converts each char into a different command for the JFugue Player
        for(int i = 0; i < rawText.length(); i++) {
            char charRead = rawText.charAt(i);
            String command = "";

            switch(nextCommand(charRead, previousNote)) {

                case NOTE:
                    command = charRead + Integer.toString(currentOctave);
                    break;

                case REPEAT:
                    command = previousNote;
                    break;

                case INSTRUMENT:
                    currentInstrument = instrumentMap.get(charRead);
                    command = Constants.JF_INSTRUMENT + Integer.toString(currentInstrument);
                    break;

                case VOLUME:
                    currentVolume = currentVolume*2;
                    if (currentVolume > Constants.MAX_VOLUME) {
                        currentVolume = Constants.DEFAULT_VOLUME;
                    }
                    command = Constants.JF_VOLUME + Integer.toString(currentVolume) + ")";
                    break;

                case OCTAVE:
                    currentOctave++;
                    if (currentOctave > 9) {
                        currentOctave = Constants.DEFAULT_OCTAVE;
                    }
                    command = " "; // Necessary for the next "previousNote" comparison
                    break;

                case DIGIT:
                    currentInstrument += charRead - '0'; // Converts ASCII code from charRead to the coresponding int
                    if (currentInstrument > 255) {
                        currentInstrument = 0;
                    }
                    command = Constants.JF_INSTRUMENT + Integer.toString(currentInstrument);
                    break;

                case BLANK:
                    command = Constants.PAUSE;
                    break;
            }
            previousNote = command;
            command += Constants.BLANK_NOTE;
            //System.out.println(charRead + " = " + command);
            finalString += command;
        }

        return finalString.replace("  ", "");
    }

    // Decides what's the command given the current char read and previous note
    public static int nextCommand(char charRead, String previousNote) {

        if (isNote(charRead)) {
            return NOTE;
        }
        
        else if (isNoteLower(charRead)) {
            charRead = Character.toUpperCase(charRead);
            if (charRead == previousNote.charAt(0)) {
                return REPEAT;
            }
            else {
                return BLANK;
            }
        }

        else if (isVowel(charRead)) {
            return INSTRUMENT;
        }

        else if (isBlank(charRead)) {
            return VOLUME;
        }

        else if (isOctave(charRead)) {
            return OCTAVE;
        }

        else if (isDigit(charRead)) {
            return DIGIT;
        }

        else if (isBells(charRead) || isNL(charRead) || isFlute(charRead) || isOrgan(charRead)) {
            return INSTRUMENT;
        }

        else if (isNote(previousNote.charAt(0))) {
            return REPEAT;
        }

        return BLANK;
    }

    // Tests to define what type of command is the current char
    public static boolean isNote(char charRead) {
        return (charRead >= 'A' && charRead <= 'G');
    }

    public static boolean isNoteLower(char charRead) {
        return (charRead >= 'a' && charRead <= 'g');
    }

    public static boolean isVowel(char charRead) {
        charRead = Character.toLowerCase(charRead);
        return (charRead == 'i' || charRead == 'o' || charRead == 'u');
    }

    public static boolean isBlank(char charRead) {
        return (charRead == ' ');
    }

    public static boolean isNL(char charRead) {
        return (charRead == '\n');
    }

    public static boolean isBells(char charRead) {
        return (charRead == '!');
    }

    public static boolean isOctave(char charRead) {
        return (charRead == '?' || charRead == '.');
    }

    public static boolean isFlute(char charRead) {
        return (charRead == ';');
    }

    public static boolean isOrgan(char charRead) {
        return (charRead == ',');
    }

    public static boolean isDigit(char charRead) {
        return (charRead >= '0' && charRead <= '9');
    }
}
