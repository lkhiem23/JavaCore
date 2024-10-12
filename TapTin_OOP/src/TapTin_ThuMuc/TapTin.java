/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lhkhiem_06thang5;

/**
 *
 * @author ADMIN
 */
public class TapTin {
    private String name;
    private String extension;
    private long size; // Dung lượng của tập tin

    public TapTin(String name, String extension, long size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public long getSize() {
        return size;
    }
}
