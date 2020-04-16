/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Kshitij Kumar
 */
public class FiletypeFilter extends FileFilter {
    private final String extension;
    private final String description;
    public FiletypeFilter(String extension,String description)
    {
        this.extension=extension;
        this.description=description;
    }
    @Override
    public boolean accept(File file)
    {
        if(file.isDirectory())
        {
            return true;
        }
        return file.getName().endsWith(extension);
        //returning file name with extension
    }
    @Override
    public String getDescription()
    {
        return description+String.format(" (*%s)",extension);
    }
}
