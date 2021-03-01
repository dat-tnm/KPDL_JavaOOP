/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong05.donglenh;

import java.io.File;
import javaapp00.chuong05.logic.FileAndDirectoryOperations;

/**
 *
 * @author Admin
 */
public class testFileDirectory {
    public static void main(String[] args){
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
        File[] content = fo.getDirectoryContent("E:\\Ampps");
        //System.out.println(fo.displayContent(content));
//        
//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sach cac thu muc con la: ");
//        System.out.println(fo.displayContent(thumuc));
//        File[] teptin = fo.getFiles(content);
//        System.out.println("Danh sach cac tep tin la: ");
//        System.out.println(fo.displayContent(teptin));

        fo.getContentRecursively("E:\\Ampps\\apache");
    }
}
