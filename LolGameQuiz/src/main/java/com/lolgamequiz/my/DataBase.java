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
                R.drawable.heimerdingerr));

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

        heroes.add(new Hero("Jayce",
                R.drawable.jayce,
                R.drawable.jayce_passive,
                R.drawable.jaycetotheskies,
                R.drawable.jaycestaticfield,
                R.drawable.jaycethunderingblow,
                R.drawable.jaycestancehtg));

        heroes.add(new Hero("Jinx",
                R.drawable.jinx,
                R.drawable.jinx_passive,
                R.drawable.jinxq,
                R.drawable.jinxw,
                R.drawable.jinxe,
                R.drawable.jinxrwrapper));

        heroes.add(new Hero("Karma",
                R.drawable.karma,
                R.drawable.karma_passive,
                R.drawable.karmaq,
                R.drawable.karmaspiritbind,
                R.drawable.karmasolkimshield,
                R.drawable.karmamantra));

        heroes.add(new Hero("Karthus",
                R.drawable.karthus,
                R.drawable.lich_defied,
                R.drawable.laywaste,
                R.drawable.wallofpain,
                R.drawable.defile,
                R.drawable.fallenone));

        heroes.add(new Hero("Kassadin",
                R.drawable.kassadin,
                R.drawable.voidwalker_netherburn,
                R.drawable.nulllance,
                R.drawable.netherblade,
                R.drawable.forcepulse,
                R.drawable.riftwalk));

        heroes.add(new Hero("Katarina",
                R.drawable.katarina,
                R.drawable.katarina_voracity,
                R.drawable.katarinaq,
                R.drawable.katarinaw,
                R.drawable.katarinae,
                R.drawable.katarinar));

        heroes.add(new Hero("Kayle",
                R.drawable.kayle,
                R.drawable.judicator_divineblessing,
                R.drawable.judicatorreckoning,
                R.drawable.judicatordivineblessing,
                R.drawable.judicatorrighteousfury,
                R.drawable.judicatorintervention));

        heroes.add(new Hero("Kennen",
                R.drawable.kennen,
                R.drawable.kennen_markofstorm,
                R.drawable.kennenshurikenhurlmissile1,
                R.drawable.kennenbringthelight,
                R.drawable.kennenlightningrush,
                R.drawable.kennenshurikenstorm));

        heroes.add(new Hero("Kha'Zix",
                R.drawable.khazix,
                R.drawable.khazix_p,
                R.drawable.khazixq,
                R.drawable.khazixw,
                R.drawable.khazixe,
                R.drawable.khazixr));

        heroes.add(new Hero("\Kog'Maw",
                R.drawable.kogmaw,
                R.drawable.kogmaw_icathiansurprise,
                R.drawable.kogmawcausticspittle,
                R.drawable.kogmawbioarcanebarrage,
                R.drawable.kogmawvoidooze,
                R.drawable.kogmawlivingartillery));

        heroes.add(new Hero("LeBlanc",
                R.drawable.leblanc,
                R.drawable.leblancmirrorimage,
                R.drawable.leblancchaosorb,
                R.drawable.leblancslide,
                R.drawable.leblancsoulshackle,
                R.drawable.leblancmimic));

        heroes.add(new Hero("Lee Sin",
                R.drawable.leesin,
                R.drawable.fioraflurry,
                R.drawable.blindmonkqone,
                R.drawable.blindmonkwone,
                R.drawable.blindmonkeone,
                R.drawable.blindmonkrkick));

        heroes.add(new Hero("Leona",
                R.drawable.leona,
                R.drawable.leonasunlight,
                R.drawable.leonashieldofdaybreak,
                R.drawable.leonasolarbarrier,
                R.drawable.leonazenithblade,
                R.drawable.leonasolarflare));

        heroes.add(new Hero("Lissandra",
                R.drawable.lissandra,
                R.drawable.lissandra_passive,
                R.drawable.lissandraq,
                R.drawable.lissandraw,
                R.drawable.lissandrae,
                R.drawable.lissandrar));

        heroes.add(new Hero("Lucian",
                R.drawable.lucian,
                R.drawable.lucian_passive,
                R.drawable.lucianq,
                R.drawable.lucianw,
                R.drawable.luciane,
                R.drawable.lucianr));

        heroes.add(new Hero("Lulu",
                R.drawable.lulu,
                R.drawable.lulu_pixfaeriecompanion,
                R.drawable.luluq,
                R.drawable.luluw,
                R.drawable.lulue,
                R.drawable.lulur));

        heroes.add(new Hero("Lux",
                R.drawable.lux,
                R.drawable.luxilluminatingfraulein,
                R.drawable.luxlightbinding,
                R.drawable.luxprismaticwave,
                R.drawable.luxlightstrikekugel,
                R.drawable.luxmalicecannon));

        heroes.add(new Hero("Malphite",
                R.drawable.malphite,
                R.drawable.malphite_graniteshield,
                R.drawable.seismicshard,
                R.drawable.obduracy,
                R.drawable.landslide,
                R.drawable.ufslash));

        heroes.add(new Hero("Malzahar",
                R.drawable.malzahar,
                R.drawable.alzahar_summonvoidling,
                R.drawable.alzaharcallofthevoid,
                R.drawable.alzaharnullzone,
                R.drawable.alzaharmaleficvisions,
                R.drawable.alzaharnethergrasp));

        heroes.add(new Hero("Maokai",
                R.drawable.maokai,
                R.drawable.maokai_sapmagic,
                R.drawable.maokaitrunkline,
                R.drawable.maokaiunstablegrowth,
                R.drawable.maokaisapling2,
                R.drawable.maokaidrain3));

        heroes.add(new Hero("Master Yi",
                R.drawable.masteryi,
                R.drawable.masteryi_passive1,
                R.drawable.alphastrike,
                R.drawable.meditate,
                R.drawable.wujustyle,
                R.drawable.highlander));

        heroes.add(new Hero("Miss Fortune",
                R.drawable.missfortune,
                R.drawable.missfortune_strut,
                R.drawable.missfortunericochetshot,
                R.drawable.missfortuneviciousstrikes,
                R.drawable.missfortunescattershot,
                R.drawable.missfortunebullettime));

        heroes.add(new Hero("Mordekaiser",
                R.drawable.mordekaiser,
                R.drawable.mordekaiser_ironman,
                R.drawable.mordekaisermaceofspades,
                R.drawable.mordekaisercreepingdeathcast,
                R.drawable.mordekaisersyphonofdestruction,
                R.drawable.mordekaiserchildrenofthegrave));

        heroes.add(new Hero("Morgana",
                R.drawable.morgana,
                R.drawable.fallenangel_empathize,
                R.drawable.darkbindingmissile,
                R.drawable.tormentedsoil,
                R.drawable.blackshield,
                R.drawable.soulshackles));

        heroes.add(new Hero("Nami",
                R.drawable.nami,
                R.drawable.namipassive,
                R.drawable.namiq,
                R.drawable.namiw,
                R.drawable.namie,
                R.drawable.namir));

        heroes.add(new Hero("Nasus",
                R.drawable.nasus,
                R.drawable.nasus_passive,
                R.drawable.nasusq,
                R.drawable.nasusw,
                R.drawable.nasuse,
                R.drawable.nasusr));

        heroes.add(new Hero("Nautilus",
                R.drawable.nautilus,
                R.drawable.nautilus_staggeringblow,
                R.drawable.nautilusanchordrag,
                R.drawable.nautiluspiercinggaze,
                R.drawable.nautilussplashzone,
                R.drawable.nautilusgrandline));

        heroes.add(new Hero("Nidalee",
                R.drawable.nidalee,
                R.drawable.nidalee_ontheprowl,
                R.drawable.javelintoss,
                R.drawable.bushwhack,
                R.drawable.primalsurge,
                R.drawable.aspectofthecougar));

        heroes.add(new Hero("Nocturne",
                R.drawable.nocturne,
                R.drawable.nocturne_umbrablades,
                R.drawable.nocturneduskbringer,
                R.drawable.nocturneshroudofdarkness,
                R.drawable.nocturneunspeakablehorror,
                R.drawable.nocturneparanoia));

        heroes.add(new Hero("Nunu",
                R.drawable.nunu,
                R.drawable.yeti_frostnova,
                R.drawable.consume,
                R.drawable.bloodboil,
                R.drawable.iceblast,
                R.drawable.absolutezero));

        heroes.add(new Hero("Olaf",
                R.drawable.olaf,
                R.drawable.olaf_passive,
                R.drawable.olafaxethrowcast,
                R.drawable.olaffrenziedstrikes,
                R.drawable.olafrecklessstrike,
                R.drawable.olafragnarok));

        heroes.add(new Hero("Orianna",
                R.drawable.orianna,
                R.drawable.oriannapassive,
                R.drawable.orianaizunacommand,
                R.drawable.orianadissonancecommand,
                R.drawable.orianaredactcommand,
                R.drawable.orianadetonatecommand));

        heroes.add(new Hero("Pantheon",
                R.drawable.pantheon,
                R.drawable.pantheon_aoz,
                R.drawable.pantheon_throw,
                R.drawable.pantheon_leapbash,
                R.drawable.pantheon_heartseeker,
                R.drawable.pantheon_grandskyfall_jump));

        heroes.add(new Hero("Poppy",
                R.drawable.poppy,
                R.drawable.poppy_valiantfighter,
                R.drawable.poppydevastatingblow,
                R.drawable.poppyparagonofdemacia,
                R.drawable.poppyheroiccharge,
                R.drawable.poppydiplomaticimmunity));

        heroes.add(new Hero("Quinn",
                R.drawable.quinn,
                R.drawable.quinn_passive,
                R.drawable.quinnq,
                R.drawable.quinnw,
                R.drawable.quinne,
                R.drawable.quinnr));

        heroes.add(new Hero("Rammus",
                R.drawable.rammus,
                R.drawable.armordillo_scavengearmor,
                R.drawable.powerball,
                R.drawable.defensiveballcurl,
                R.drawable.puncturingtaunt,
                R.drawable.tremors2));

        heroes.add(new Hero("Renekton",
                R.drawable.renekton,
                R.drawable.renekton_predator,
                R.drawable.renektoncleave,
                R.drawable.renektonpreexecute,
                R.drawable.renektonsliceanddice,
                R.drawable.renektonreignofthetyrant));

        heroes.add(new Hero("Rengar",
                R.drawable.rengar,
                R.drawable.rengar_passive,
                R.drawable.rengarq,
                R.drawable.rengarw,
                R.drawable.rengare,
                R.drawable.rengarr));

        heroes.add(new Hero("Riven",
                R.drawable.riven,
                R.drawable.rivenrunicblades,
                R.drawable.riventricleave,
                R.drawable.rivenmartyr,
                R.drawable.rivenfeint,
                R.drawable.rivenfengshuiengine));

        heroes.add(new Hero("Rumble",
                R.drawable.rumble,
                R.drawable.rumble_junkyard_titan1,
                R.drawable.rumbleflamethrower,
                R.drawable.rumbleshield,
                R.drawable.rumblegrenade,
                R.drawable.rumblecarpetbomb));

        heroes.add(new Hero("Ryze",
                R.drawable.ryze,
                R.drawable.ryze_spellstrike,
                R.drawable.overload,
                R.drawable.runeprison,
                R.drawable.spellflux,
                R.drawable.desperatepower));

        heroes.add(new Hero("Sejuani",
                R.drawable.sejuani,
                R.drawable.sejuani_passive,
                R.drawable.sejuaniarcticassault,
                R.drawable.sejuaninorthernwinds,
                R.drawable.sejuaniwintersclaw,
                R.drawable.sejuaniglacialprisonstart));



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
