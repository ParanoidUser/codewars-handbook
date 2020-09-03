import static java.util.Map.entry;
import static java.util.Map.ofEntries;

interface Supernatural {
  static String bob(String beast) {
    return ofEntries(
        entry("werewolf", "Silver knife or bullet to the heart"),
        entry("vampire", "Behead it with a machete"),
        entry("wendigo", "Burn it to death"),
        entry("shapeshifter", "Silver knife or bullet to the heart"),
        entry("angel", "Use the angelic blade"),
        entry("demon", "Use Ruby's knife, or some Jesus-juice"),
        entry("ghost", "Salt and iron, and don't forget to burn the corpse"),
        entry("dragon", "You have to find the excalibur for that"),
        entry("djinn", "Stab it with silver knife dipped in a lamb's blood"),
        entry("pagan god", "It depends on which one it is"),
        entry("leviathan", "Use some Borax, then kill Dick"),
        entry("ghoul", "Behead it"),
        entry("jefferson starship", "Behead it with a silver blade"),
        entry("reaper", "If it's nasty, you should gank who controls it"),
        entry("rugaru", "Burn it alive"),
        entry("skinwalker", "A silver bullet will do it"),
        entry("phoenix", "Use the colt"),
        entry("witch", "They are humans"))
        .getOrDefault(beast, "I have friggin no idea yet") + ", idjits!";
  }
}
