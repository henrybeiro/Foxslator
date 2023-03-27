package TextConverter;


public class Constants {

    public static final String PAUSE = "R";
    public static final String JF_TEMPO = "T";
    public static final String JF_VOLUME = ":CON(7,";
    public static final String JF_INSTRUMENT = "I";

    public static final String A_NOTE = "A";
    public static final String B_NOTE = "B";
    public static final String C_NOTE = "C";
    public static final String D_NOTE = "D";
    public static final String E_NOTE = "E";
    public static final String F_NOTE = "F";
    public static final String G_NOTE = "G";
    public static final String BLANK_NOTE = " ";

    public static final int MAX_OCTAVE = 9;
    public static final int MAX_VOLUME = 127;
    public static final int DEFAULT_TEMPO = 120;
    public static final int DEFAULT_VOLUME = 60;
    public static final int DEFAULT_OCTAVE = 4;
    public static final int DEFAULT_INSTRUMENT = 0;

    public static final char[] INSTRUMENT_CHARACTERS = {'i', 'I', 'o', 'O', 'U', 'u', '!', '\n', ';', ','};
    public static final int[] INSTRUMENT_INDEX = {6, 6, 6, 6, 6, 6, 113, 13, 75, 19};
}
