package idk;

import java.io.File;

public class TextFileFilter {
    public boolean accept(File pathname){
        return pathname.getName().toLowerCase().endsWith(".csv");
    }
}