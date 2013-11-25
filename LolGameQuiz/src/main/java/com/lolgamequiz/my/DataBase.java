package com.lolgamequiz.my;

import java.util.Vector;

public class DataBase {
    public Vector<Hero> heroes;

    public DataBase() {
        heroes = new Vector<Hero>();

        heroes.add(new Hero("Aatrox",
                R.drawable.aatrox,
                R.drawable.aatrox_passive,
                R.drawable.aatroxq,
                R.drawable.aatroxw,
                R.drawable.aatroxe,
                R.drawable.aatroxr));

        heroes.add(new Hero("Ahri",
                R.drawable.ahri,
                R.drawable.ahri_souleater,
                R.drawable.ahriorbofdeception,
                R.drawable.ahrifoxfire,
                R.drawable.ahriseduce,
                R.drawable.ahritumble));

        heroes.add(new Hero("Akali",
                R.drawable.akali,
                R.drawable.akalitwindisciplines,
                R.drawable.akalimota,
                R.drawable.akalismokebomb,
                R.drawable.akalishadowswipe,
                R.drawable.akalishadowdance));

        heroes.add(new Hero("Alistar",
                R.drawable.alistar,
                R.drawable.minotaur_colossalstrength,
                R.drawable.pulverize,
                R.drawable.headbutt,
                R.drawable.triumphantroar,
                R.drawable.ferocioushowl));

        heroes.add(new Hero("Amumu",
                R.drawable.amumu,
                R.drawable.sadmummy_corpseexplosion,
                R.drawable.bandagetoss,
                R.drawable.auraofdespair,
                R.drawable.tantrum,
                R.drawable.curseofthesadmummy));

        heroes.add(new Hero("Anivia",
                R.drawable.anivia,
                R.drawable.cryophoenix_rebirth,
                R.drawable.flashfrost,
                R.drawable.crystallize,
                R.drawable.frostbite,
                R.drawable.glacialstorm));

        heroes.add(new Hero("Annie",
                R.drawable.annie,
                R.drawable.annie_passive,
                R.drawable.disintegrate,
                R.drawable.incinerate,
                R.drawable.moltenshield,
                R.drawable.infernalguardian));

        heroes.add(new Hero("Ashe",
                R.drawable.ashe,
                R.drawable.bowmaster_bullseye,
                R.drawable.frostshot,
                R.drawable.volley,
                R.drawable.ashespiritofthehawk,
                R.drawable.enchantedcrystalarrow));

        heroes.add(new Hero("Blitzcrank",
                R.drawable.blitzcrank,
                R.drawable.blitzcrank_manabarrier,
                R.drawable.rocketgrab,
                R.drawable.overdrive,
                R.drawable.powerfist,
                R.drawable.staticfield));

        heroes.add(new Hero("Brand",
                R.drawable.brand,
                R.drawable.brandblaze,
                R.drawable.brandblaze2,
                R.drawable.brandfissure,
                R.drawable.brandconflagration,
                R.drawable.brandwildfire));

        heroes.add(new Hero("Caitlyn",
                R.drawable.caitlyn,
                R.drawable.caitlyn_headshot,
                R.drawable.caitlynpiltoverpeacemaker,
                R.drawable.caitlynyordletrap,
                R.drawable.caitlynentrapment,
                R.drawable.caitlynaceinthehole));

        heroes.add(new Hero("Cassiopeia",
                R.drawable.cassiopeia,
                R.drawable.cassiopeia_deadlycadence,
                R.drawable.cassiopeianoxiousblast,
                R.drawable.cassiopeiamiasma,
                R.drawable.cassiopeiatwinfang,
                R.drawable.cassiopeiapetrifyinggazespell));

        heroes.add(new Hero("Cho'Gath",
                R.drawable.chogath,
                R.drawable.greenterror_tailspike,
                R.drawable.rupture,
                R.drawable.feralscream,
                R.drawable.vorpalspikes,
                R.drawable.feast));

        heroes.add(new Hero("Corki",
                R.drawable.corki,
                R.drawable.corki_rapidreload,
                R.drawable.phosphorusbomb,
                R.drawable.carpetbomb,
                R.drawable.ggun,
                R.drawable.missilebarrage));

        heroes.add(new Hero("Darius",
                R.drawable.darius,
                R.drawable.darius_icon_hemorrhage,
                R.drawable.dariuscleave,
                R.drawable.dariusnoxiantacticsonh,
                R.drawable.dariusaxegrabcone,
                R.drawable.dariusexecute));

        heroes.add(new Hero("Diana",
                R.drawable.diana,
                R.drawable.diana_passive_lunarblade,
                R.drawable.dianaarc,
                R.drawable.dianaorbs,
                R.drawable.dianavortex,
                R.drawable.dianateleport));

        heroes.add(new Hero("Dr. Mudo",
                R.drawable.drmundo,
                R.drawable.drmundo_adrenalinerush2,
                R.drawable.infectedcleavermissilecast,
                R.drawable.burningagony,
                R.drawable.masochism,
                R.drawable.sadism));

        heroes.add(new Hero("Draven",
                R.drawable.draven,
                R.drawable.draven_passive,
                R.drawable.dravenspinning,
                R.drawable.dravenfury,
                R.drawable.dravendoubleshot,
                R.drawable.dravenrcast));

        heroes.add(new Hero("Elise",
                R.drawable.elise,
                R.drawable.elisepassive,
                R.drawable.elisehumanq,
                R.drawable.elisehumanw,
                R.drawable.elisehumane,
                R.drawable.eliser));

        heroes.add(new Hero("Evelynn",
                R.drawable.evelynn,
                R.drawable.evelynn_shadowwalk,
                R.drawable.evelynnq,
                R.drawable.evelynnw,
                R.drawable.evelynne,
                R.drawable.evelynnr));

        heroes.add(new Hero("Ezreal",
                R.drawable.ezreal,
                R.drawable.ezreal_risingspellforce,
                R.drawable.ezrealmysticshot,
                R.drawable.ezrealessenceflux,
                R.drawable.ezrealarcaneshift,
                R.drawable.ezrealtrueshotbarrage));

        heroes.add(new Hero("",
                R.drawable.,
                R.drawable.,
                R.drawable.,
                R.drawable.,
                R.drawable.,
                R.drawable.));




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
