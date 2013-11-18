package com.lolgamequiz.my;

import java.util.Vector;

public class DataBase {
    public Vector<Hero> heroes;

    public DataBase() {
        heroes = new Vector<Hero>();

        heroes.add(new Hero("Aatrox",
                R.drawable.Aatrox,
                R.drawable.Aatrox_Passive,
                R.drawable.AatroxQ,
                R.drawable.AatroxW,
                R.drawable.AatroxE,
                R.drawable.AatroxR));

        heroes.add(new Hero("Ahri",
                R.drawable.Ahri,
                R.drawable.Ahri_SoulEater,
                R.drawable.AhriOrbofDeception,
                R.drawable.AhriFoxFire,
                R.drawable.AhriSeduce,
                R.drawable.AhriTumble));

        heroes.add(new Hero("Akali",
                R.drawable.Akali,
                R.drawable.AkaliTwinDisciplines,
                R.drawable.AkaliMota,
                R.drawable.AkaliSmokeBomb,
                R.drawable.AkaliShadowSwipe,
                R.drawable.AkaliShadowDance));

        heroes.add(new Hero("Alistar",
                R.drawable.Alistar,
                R.drawable.Minotaur_ColossalStrength,
                R.drawable.Pulverize,
                R.drawable.Headbutt,
                R.drawable.TriumphantRoar,
                R.drawable.FerociousHowl));

        heroes.add(new Hero("Amumu",
                R.drawable.Amumu,
                R.drawable.SadMummy_CorpseExplosion,
                R.drawable.BandageToss,
                R.drawable.AuraofDespair,
                R.drawable.Tantrum,
                R.drawable.CurseoftheSadMummy));

        heroes.add(new Hero("Anivia",
                R.drawable.Anivia,
                R.drawable.Cryophoenix_Rebirth,
                R.drawable.FlashFrost,
                R.drawable.Crystallize,
                R.drawable.Frostbite,
                R.drawable.GlacialStorm));

        heroes.add(new Hero("Annie",
                R.drawable.Annie,
                R.drawable.Annie_Passive,
                R.drawable.Disintegrate,
                R.drawable.Incinerate,
                R.drawable.MoltenShield,
                R.drawable.InfernalGuardian));

        heroes.add(new Hero("Ashe",
                R.drawable.Ashe,
                R.drawable.Bowmaster_Bullseye,
                R.drawable.FrostShot,
                R.drawable.Volley,
                R.drawable.AsheSpiritOfTheHawk,
                R.drawable.EnchantedCrystalArrow));

        heroes.add(new Hero("Blitzcrank",
                R.drawable.Blitzcrank,
                R.drawable.Blitzcrank_ManaBarrier,
                R.drawable.RocketGrab,
                R.drawable.Overdrive,
                R.drawable.PowerFist,
                R.drawable.StaticField));

        heroes.add(new Hero("Brand",
                R.drawable.Brand,
                R.drawable.BrandBlaze,
                R.drawable.BrandBlaze2,
                R.drawable.BrandFissure,
                R.drawable.BrandConflagration,
                R.drawable.BrandWildfire));






//        heroes.add(new Hero("",
//                R.drawable.,
//                R.drawable.,
//                R.drawable.,
//                R.drawable.,
//                R.drawable.,
//                R.drawable.));
    }

    public Hero getHero(int idx) {
        return heroes.get(idx);
    }

    public int size() {
        return heroes.size();
    }

    public void remove(int idx) {
        heroes.remove(idx);
    }

    public int getSkillAmount() {
        return heroes.get(0).getSkillAmount();
    }

    public Hero find(String name) {
        for(int i = 0; i < heroes.size(); ++i) {
            if(name.matches(heroes.get(i).getName()))
                return heroes.get(i);
        }
        return null;
    }
}
