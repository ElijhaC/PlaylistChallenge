package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int index = 0;
        int forward = 0;
        int backward = 0;

        for (int i = startIndex + 1; i < playList.length; i++){
            if (playList[i].equals(selection)){
                index = i;
            }
            forward = index - startIndex;
        }

        for (int i = startIndex + 1; i > -1; i--){
            if (playList[i].equals(selection)){
                index = i;
            }
            backward = (startIndex + playList.length) - index;
        }
        return Math.min(forward, backward);
    }
}
