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

        heroes.add(new Hero("Fiddlesticks",
                R.drawable.fiddlesticks,
                R.drawable.fiddlesticks_paranoia,
                R.drawable.terrify,
                R.drawable.drain,
                R.drawable.fiddlesticksdarkwind,
                R.drawable.crowstorm));

        heroes.add(new Hero("Fiora",
                R.drawable.fiora,
                R.drawable.fiora_duelist,
                R.drawable.fioraq,
                R.drawable.fiorariposte,
                R.drawable.fioraflurry,
                R.drawable.fioradance));

        heroes.add(new Hero("Fizz",
                R.drawable.fizz,
                R.drawable.fizzpassive,
                R.drawable.fizzpiercingstrike,
                R.drawable.fizzseastonepassive,
                R.drawable.fizzjump,
                R.drawable.fizzmarinerdoom));

        heroes.add(new Hero("Galio",
                R.drawable.galio,
                R.drawable.galio_runicskin,
                R.drawable.galioresolutesmite,
                R.drawable.galiobulwark,
                R.drawable.galiorighteousgust,
                R.drawable.galioidolofdurand));

        heroes.add(new Hero("Gangplank",
                R.drawable.gangplank,
                R.drawable.pirate_grogsoakedblade,
                R.drawable.parley,
                R.drawable.removescurvy,
                R.drawable.raisemorale,
                R.drawable.cannonbarrage));

        heroes.add(new Hero("Garen",
                R.drawable.garen,
                R.drawable.garen_passive,
                R.drawable.garenq,
                R.drawable.garenw,
                R.drawable.garene,
                R.drawable.garenr));

        heroes.add(new Hero("Gragas",
                R.drawable.gragas,
                R.drawable.gragaspassiveheal,
                R.drawable.gragasbarrelroll,
                R.drawable.gragasdrunkenrage,
                R.drawable.gragasbodyslam,
                R.drawable.gragasexplosivecask));

        heroes.add(new Hero("Graves",
                R.drawable.graves,
                R.drawable.gravestruegrit,
                R.drawable.gravesclustershot,
                R.drawable.gravessmokegrenade,
                R.drawable.gravesmove,
                R.drawable.graveschargeshot));

        heroes.add(new Hero("Hecarim",
                R.drawable.hecarim,
                R.drawable.hecarim_passive,
                R.drawable.hecarimrapidslash,
                R.drawable.hecarimw,
                R.drawable.hecarimramp,
                R.drawable.hecarimult));

        heroes.add(new Hero("Heimerdinger",
                R.drawable.heimerdinger,
                R.drawable.heimerdinger_techmaturgicalrepairbots,
                R.drawable.heimerdingerq,
                R.drawable.heimerdingerw,
                R.drawable.heimerdingere,
                R.drawable.heimerdingerr);

        heroes.add(new Hero("Irelia",
                R.drawable.irelia,
                R.drawable.irelia_ionianfervor,
                R.drawable.ireliagatotsu,
                R.drawable.ireliahitenstyle,
                R.drawable.ireliaequilibriumstrike,
                R.drawable.ireliatranscendentblades));

        heroes.add(new Hero("Janna",
                R.drawable.janna,
                R.drawable.janna_tailwind,
                R.drawable.howlinggale,
                R.drawable.sowthewind,
                R.drawable.eyeofthestorm,
                R.drawable.reapthewhirlwind));

        heroes.add(new Hero("Jarvan IV",
                R.drawable.jarvaniv,
                R.drawable.jarvaniv_martialcadence,
                R.drawable.jarvanivdragonstrike,
                R.drawable.jarvanivgoldenaegis,
                R.drawable.jarvanivdemacianstandard,
                R.drawable.jarvanivcataclysm));

        heroes.add(new Hero("Jax",
                R.drawable.jax,
                R.drawable.armsmaster_masterofarms,
                R.drawable.jaxleapstrike,
                R.drawable.jaxempowertwo,
                R.drawable.jaxcounterstrike,
                R.drawable.jaxrelentlessassault));




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
