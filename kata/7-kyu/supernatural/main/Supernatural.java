import java.util.HashMap;

class Supernatural {
  static String bob(String beast) {
    var map = new HashMap<>();
    map.put("werewolf", "Silver knife or bullet to the heart");
    map.put("vampire", "Behead it with a machete");
    map.put("wendigo", "Burn it to death");
    map.put("shapeshifter", "Silver knife or bullet to the heart");
    map.put("angel", "Use the angelic blade");
    map.put("demon", "Use Ruby's knife, or some Jesus-juice");
    map.put("ghost", "Salt and iron, and don't forget to burn the corpse");
    map.put("dragon", "You have to find the excalibur for that");
    map.put("djinn", "Stab it with silver knife dipped in a lamb's blood");
    map.put("pagan god", "It depends on which one it is");
    map.put("leviathan", "Use some Borax, then kill Dick");
    map.put("ghoul", "Behead it");
    map.put("jefferson starship", "Behead it with a silver blade");
    map.put("reaper", "If it's nasty, you should gank who controls it");
    map.put("rugaru", "Burn it alive");
    map.put("skinwalker", "A silver bullet will do it");
    map.put("phoenix", "Use the colt");
    map.put("witch", "They are humans");
    return map.getOrDefault(beast, "I have friggin no idea yet") + ", idjits!";
  }
}
