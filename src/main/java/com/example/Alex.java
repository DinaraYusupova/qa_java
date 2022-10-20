package com.example;

import java.util.List;

public class Alex extends Lion{

    public Alex(Feline feline) throws Exception {
        super(feline);
    }

    public List<String> getFriends() throws Exception {
        return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
