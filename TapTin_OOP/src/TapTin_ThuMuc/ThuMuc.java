/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lhkhiem_06thang5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ThuMuc {
    private String name;
    private List<TapTin> files;
    private List<ThuMuc> subFolders;

    public ThuMuc(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public void addFile(TapTin file) {
        files.add(file);
    }

    public void addFolder(ThuMuc folder) {
        subFolders.add(folder);
    }

    public long getTotalSize() {
        long totalSize = 0;
        for (TapTin file : files) {
            totalSize += file.getSize();
        }
        for (ThuMuc folder : subFolders) {
            totalSize += folder.getTotalSize();
        }
        return totalSize;
    }

    public TapTin findLargestFile() {
        TapTin largestFile = null;
        long maxSize = 0;

        for (TapTin file : files) {
            if (file.getSize() > maxSize) {
                maxSize = file.getSize();
                largestFile = file;
            }
        }

        for (ThuMuc folder : subFolders) {
            TapTin largestInSubFolder = folder.findLargestFile();
            if (largestInSubFolder != null && largestInSubFolder.getSize() > maxSize) {
                maxSize = largestInSubFolder.getSize();
                largestFile = largestInSubFolder;
            }
        }

        return largestFile;
    }

    public void displayStructure(String prefix) {
        System.out.println(prefix + "Thu muc: " + name);
        for (TapTin file : files) {
            System.out.println(prefix + "+ Tap tin: " + file.getName() + "." + file.getExtension() + " (" + file.getSize() + " bytes)");
        }
        for (ThuMuc folder : subFolders) {
            folder.displayStructure(prefix + "  ");
        }
    }
}
