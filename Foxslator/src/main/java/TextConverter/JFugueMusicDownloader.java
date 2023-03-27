package TextConverter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jfugue.player.Player;

public class JFugueMusicDownloader {
    private String music;
    private String fileName;
    private String directoryPath;


    public JFugueMusicDownloader(String music, String fileName, String directoryPath, String downloadsDirectoryPath) {
        this.music = music;
        //System.out.println(this.fileName);
        if (fileName == "") {
            this.fileName = "minha_musica.mid";
        } else {
                this.fileName = fileName + ".mid";
            }
        //System.out.println(directoryPath);
        //System.out.println(downloadsDirectoryPath);

            if (directoryPath == "") {
                this.directoryPath = downloadsDirectoryPath;
            } else {
                this.directoryPath = directoryPath;
            }
        //System.out.println(this.directoryPath);
        }


        public void downloadMusic() {

            Player player = new Player();
            File file = new File(directoryPath + "/" + fileName);

            try {
                FileOutputStream fos = new FileOutputStream(file);
                org.jfugue.pattern.Pattern pat = new org.jfugue.pattern.Pattern();
                pat.add(music);
                org.jfugue.midi.MidiFileManager.savePatternToMidi(pat, fos);
                fos.close();
                System.out.println("Música salva com sucesso em " + directoryPath + "/" + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
