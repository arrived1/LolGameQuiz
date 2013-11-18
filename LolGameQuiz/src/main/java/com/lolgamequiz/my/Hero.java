package com.lolgamequiz.my;

import java.util.Vector;

public class Hero {
    private String name;
    private int pic;
    private Vector<Integer> skills;

    Hero(String name, int pic, int skill1, int skill2, int skill3, int skill4, int ulti) {
        this.name = name;
        this.pic = pic;
        skills = new Vector<Integer>();
        skills.add(skill1);
        skills.add(skill2);
        skills.add(skill3);
        skills.add(skill4);
        skills.add(ulti);
    }

    public int getPic() {
        return pic;
    }

    public int getSkill(int i) {
        switch(i) {
            case 1:
                return skills.get(0);
            case 2:
                return skills.get(1);
            case 3:
                return skills.get(2);
            case 4:
                return skills.get(3);
            case 0:
                return skills.get(4); //ulti
        }
        return -1;
    }

    public int getSkillAmount() {
        return skills.size();
    }

    public String getName() {
        return name;
    }
}
