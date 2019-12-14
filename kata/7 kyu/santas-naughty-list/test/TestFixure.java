import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestFixure {
  @Test
  public void basicTest() {
    var santasList = List.of("Jason", "Jackson", "Jordan", "Johnny");
    var children = List.of("Jason", "Jordan", "Jennifer");
    var goodChildren = List.of("Jason", "Jordan");
    assertEquals(goodChildren, findList.findChildren(santasList, children));
  }

  @Test
  public void sortingTest() {
    var santasList = List.of("Jason", "Jackson", "Johnson", "JJ");
    var children = List.of("Jason", "James", "JJ");
    var goodChildren = List.of("JJ", "Jason");
    assertEquals(goodChildren, findList.findChildren(santasList, children));
  }

  @Test
  public void capitalizationTest() {
    var santasList = List.of("jASon", "JAsoN", "JaSON", "jasON");
    var children = List.of("JasoN", "jASOn", "JAsoN", "jASon", "JASON");
    var goodChildren = List.of("JAsoN", "jASon");
    assertEquals(goodChildren, findList.findChildren(santasList, children));
  }
}
