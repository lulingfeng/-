package com.example.entity;

public class Msg {
    public static final int TYPE_RECEIVED=0;
    public static final int TYPE_SENT=1;
    private String content;
    private int type;
    public Msg(String content,int type){
        this.content=content;
        this.type=type;
    }

    public int getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(int type) {
        this.type = type;
    }
}
