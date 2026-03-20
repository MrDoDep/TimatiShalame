package org.example;



public class Account {
    private final String name;
    public Account(String name){
        this.name = name;
    }
    public boolean checkNameToEmboss() {
        if (name == null) {
            return false;
        }
        int length = name.length();
        if (length < 3 || length > 19) {
            return false;
        }
        int firstSpaceIndex = name.indexOf(' ');
        int lastSpaceIndex = name.lastIndexOf(' ');
        if (firstSpaceIndex == -1) {
            return false;
        }
        if (firstSpaceIndex != lastSpaceIndex) {
            return false;
        }
        if (name.charAt(length - 1) == ' ') {
            return false;
        }
        if (name.charAt(0) == ' ') {
            return false;
        }
        return true;

    }
}
