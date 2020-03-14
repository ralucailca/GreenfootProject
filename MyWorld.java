import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,114,262);
        Flower flower = new Flower();
        addObject(flower,485,212);
        Flower flower2 = new Flower();
        addObject(flower2,362,150);
        Flower flower3 = new Flower();
        addObject(flower3,483,110);
        Flower flower4 = new Flower();
        addObject(flower4,372,242);
        Flower flower5 = new Flower();
        addObject(flower5,246,73);
        Flower flower6 = new Flower();
        addObject(flower6,514,329);
        Flower flower7 = new Flower();
        addObject(flower7,421,60);
        Flower flower8 = new Flower();
        addObject(flower8,544,75);
        Flower flower9 = new Flower();
        addObject(flower9,528,159);
        Flower flower10 = new Flower();
        addObject(flower10,437,184);
        Flower flower11 = new Flower();
        addObject(flower11,331,45);
        Flower flower12 = new Flower();
        addObject(flower12,99,48);
        Flower flower13 = new Flower();
        addObject(flower13,365,352);
        Flower flower14 = new Flower();
        addObject(flower14,440,289);
        Flower flower15 = new Flower();
        addObject(flower15,57,181);
        Flower flower16 = new Flower();
        addObject(flower16,177,157);
        Flower flower17 = new Flower();
        addObject(flower17,245,298);
        Flower flower18 = new Flower();
        addObject(flower18,40,355);
        Flower flower19 = new Flower();
        addObject(flower19,182,370);
        Flower flower20 = new Flower();
        addObject(flower20,265,228);
        Flower flower21 = new Flower();
        addObject(flower21,441,362);
        Flower flower22 = new Flower();
        addObject(flower22,567,365);
        Flower flower23 = new Flower();
        addObject(flower23,552,240);
        Flower flower24 = new Flower();
        addObject(flower24,68,83);
        Flower flower25 = new Flower();
        addObject(flower25,269,155);
        Flower flower26 = new Flower();
        addObject(flower26,172,99);
        Spider spider = new Spider();
        addObject(spider,381,94);
        Spider spider2 = new Spider();
        addObject(spider2,131,129);
        bee.setLocation(194,217);
        Flower flower27 = new Flower();
        addObject(flower27,125,280);
        bee.setLocation(325,300);
        Flower flower28 = new Flower();
        addObject(flower28,183,231);
        bee.setLocation(81,270);
        Flower flower29 = new Flower();
        addObject(flower29,291,349);
        Flower flower30 = new Flower();
        addObject(flower30,180,48);
        Flower flower31 = new Flower();
        addObject(flower31,493,40);
        Flower flower32 = new Flower();
        addObject(flower32,325,287);
        Flower flower33 = new Flower();
        addObject(flower33,314,206);
        Flower flower34 = new Flower();
        addObject(flower34,499,281);
        Flower flower35 = new Flower();
        addObject(flower35,105,365);
        Flower flower36 = new Flower();
        addObject(flower36,133,201);
        Flower flower37 = new Flower();
        addObject(flower37,198,306);
        Flower flower38 = new Flower();
        addObject(flower38,319,122);
        Flower flower39 = new Flower();
        addObject(flower39,39,32);
        Flower flower40 = new Flower();
        addObject(flower40,27,118);
        Flower flower41 = new Flower();
        addObject(flower41,40,260);
        Flower flower42 = new Flower();
        addObject(flower42,281,36);
        Flower flower43 = new Flower();
        addObject(flower43,575,126);
        spider.setLocation(394,102);
        bee.setLocation(85,260);
        spider.setLocation(418,128);
        Flower flower44 = new Flower();
        addObject(flower44,696,231);
        Flower flower45 = new Flower();
        addObject(flower45,773,65);
        Flower flower46 = new Flower();
        addObject(flower46,862,144);
        Flower flower47 = new Flower();
        addObject(flower47,681,134);
        Flower flower48 = new Flower();
        addObject(flower48,679,64);
        Flower flower49 = new Flower();
        addObject(flower49,623,274);
        Flower flower50 = new Flower();
        addObject(flower50,749,179);
        Flower flower51 = new Flower();
        addObject(flower51,905,76);
        Flower flower52 = new Flower();
        addObject(flower52,904,294);
        Flower flower53 = new Flower();
        addObject(flower53,833,232);
        Flower flower54 = new Flower();
        addObject(flower54,950,211);
        Flower flower55 = new Flower();
        addObject(flower55,849,50);
        Flower flower56 = new Flower();
        addObject(flower56,781,346);
        Flower flower57 = new Flower();
        addObject(flower57,674,354);
        Flower flower58 = new Flower();
        addObject(flower58,884,399);
        Flower flower59 = new Flower();
        addObject(flower59,782,286);
        Flower flower60 = new Flower();
        addObject(flower60,644,189);
        Flower flower61 = new Flower();
        addObject(flower61,637,72);
        flower61.setLocation(610,66);
        Flower flower62 = new Flower();
        addObject(flower62,822,419);
        Flower flower63 = new Flower();
        addObject(flower63,902,494);
        Flower flower64 = new Flower();
        addObject(flower64,864,327);
        Flower flower65 = new Flower();
        addObject(flower65,725,430);
        Flower flower66 = new Flower();
        addObject(flower66,780,515);
        Flower flower67 = new Flower();
        addObject(flower67,644,469);
        Flower flower68 = new Flower();
        addObject(flower68,694,531);
        Flower flower69 = new Flower();
        addObject(flower69,857,561);
        Flower flower70 = new Flower();
        addObject(flower70,552,446);
        Flower flower71 = new Flower();
        addObject(flower71,544,521);
        Flower flower72 = new Flower();
        addObject(flower72,624,574);
        Flower flower73 = new Flower();
        addObject(flower73,746,585);
        Flower flower74 = new Flower();
        addObject(flower74,508,435);
        Flower flower75 = new Flower();
        addObject(flower75,411,447);
        Flower flower76 = new Flower();
        addObject(flower76,434,563);
        flower74.setLocation(484,470);
        flower6.setLocation(507,371);
        flower23.setLocation(591,240);
        flower23.setLocation(566,240);
        flower34.setLocation(543,294);
        flower57.setLocation(630,391);
        flower49.setLocation(671,316);
        flower60.setLocation(629,188);
        flower23.setLocation(613,260);
        Flower flower77 = new Flower();
        addObject(flower77,337,426);
        Flower flower78 = new Flower();
        addObject(flower78,229,443);
        Flower flower79 = new Flower();
        addObject(flower79,95,456);
        Flower flower80 = new Flower();
        addObject(flower80,163,447);
        Flower flower81 = new Flower();
        addObject(flower81,38,458);
        Flower flower82 = new Flower();
        addObject(flower82,931,366);
        Flower flower83 = new Flower();
        addObject(flower83,940,147);
        Flower flower84 = new Flower();
        addObject(flower84,796,143);
        Flower flower85 = new Flower();
        addObject(flower85,924,580);
        Flower flower86 = new Flower();
        addObject(flower86,348,569);
        Flower flower87 = new Flower();
        addObject(flower87,299,509);
        Flower flower88 = new Flower();
        addObject(flower88,404,516);
        Flower flower89 = new Flower();
        addObject(flower89,521,591);
        Flower flower90 = new Flower();
        addObject(flower90,77,538);
        Flower flower91 = new Flower();
        addObject(flower91,185,546);
        Flower flower92 = new Flower();
        addObject(flower92,264,565);
        Flower flower93 = new Flower();
        addObject(flower93,129,580);
        flower80.setLocation(154,490);
        flower79.setLocation(129,435);
        flower81.setLocation(49,455);
        Flower flower94 = new Flower();
        addObject(flower94,712,365);
        Flower flower95 = new Flower();
        addObject(flower95,40,582);
        Spider spider3 = new Spider();
        addObject(spider3,847,507);
        flower.setLocation(509,228);
        flower43.setLocation(585,125);
        flower8.setLocation(556,49);
        flower48.setLocation(701,64);
        flower61.setLocation(636,82);
        flower8.setLocation(589,48);
        flower9.setLocation(533,137);
        flower43.setLocation(568,187);
        flower9.setLocation(564,124);
        removeObject(spider3);
        spider.setLocation(729,503);
        spider2.setLocation(372,101);
        spider.setLocation(850,510);
    }
}
