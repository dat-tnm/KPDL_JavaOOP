/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong05.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    public File[] getDirectoryContent(String folder){
        File dir = new File(folder);
        if (dir.isFile()) {
            return null;
        }
        File[] results = dir.listFiles();
        return results;
    }
    
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < content.length; i++) {
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isDirectory()) {
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    public File[] getFiles(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isFile()) {
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    public void getContentRecursively(String folder){
        File content = new File(folder);
        
        if (content.isFile()) {
            System.out.println(content.getPath());
            return;
        }
        
        System.out.println("Thu muc: "+folder);
        File[] sub = content.listFiles();
        for (File file : sub) {
            getContentRecursively(folder + File.separator + file.getName());
        }
        return;
    }
    
    public String readTextFile(String fileName){
        FileReader fr = null;
            StringBuilder content = new StringBuilder();
        try {
            fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while((line = br.readLine()) != null){
                content.append(line);
                content.append("\n");
            }
            
            br.close();
            fr.close();
        } 
        catch (FileNotFoundException ex) {
            return "Khong tim thay file "+fileName;
        } catch (IOException ex) {
            return "Khong the doc file "+fileName;
        }
        
        return content.toString();
    }
    
    public boolean writeTextFile(String filename, String content){
        boolean flag = true;
        FileWriter fw;
        try {
            fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            fw.close();
        } 
        catch (IOException ex) {
            return false;
        }
        return flag;
    }
}
