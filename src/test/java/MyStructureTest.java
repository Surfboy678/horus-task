
import org.junit.Test;
import static org.junit.Assert.*;


public class MyStructureTest {

  private final MyStructure myStructure = new MyStructure();

  @Test
  public void testShouldFindNodeByCode() {

    // Given
    Node node1 = new Node("code1", "renderer1");
    Node node2 = new CompositeNode("code2", "renderer2");
    Node node3 = new Node("code3", "renderer3");
    CompositeNode compositeCode4 = new CompositeNode("code4", "renderer4");
    Node node5 = new Node("code5", "renderer5");
    CompositeNode compositeNode6 = new CompositeNode("code6", "renderer6");

    myStructure.addNode(node1);
    myStructure.addNode(node2);
    myStructure.addNode(node3);
    myStructure.addNode(compositeCode4);
    myStructure.addNode(node5);
    myStructure.addNode(compositeNode6);

    // When
    INode node = myStructure.findByCode("code2");

    // Then
    assertEquals(node2, node);
  }

  @Test
  public void testShouldFindNodeByRender() {

    // Given
    Node node1 = new Node("code1", "renderer1");
    Node node2 = new CompositeNode("code2", "renderer2");
    Node node3 = new Node("code3", "renderer3");
    CompositeNode compositeCode4 = new CompositeNode("code4", "renderer4");
    Node node5 = new Node("code5", "renderer5");
    CompositeNode compositeNode6 = new CompositeNode("code6", "renderer6");

    myStructure.addNode(node1);
    myStructure.addNode(node2);
    myStructure.addNode(node3);
    myStructure.addNode(compositeCode4);
    myStructure.addNode(node5);
    myStructure.addNode(compositeNode6);

    // When
    INode node = myStructure.findByRenderer("renderer4");

    // Then
    assertEquals(node, compositeCode4);
  }

  @Test
  public void testShouldFindAllNodes() {

    // Given
    Node node1 = new Node("code1", "renderer1");
    Node node2 = new CompositeNode("code2", "renderer2");
    Node node3 = new Node("code3", "renderer3");
    CompositeNode compositeCode4 = new CompositeNode("code4", "renderer4");
    Node node5 = new Node("code5", "renderer5");
    CompositeNode compositeNode6 = new CompositeNode("code6", "renderer6");

    myStructure.addNode(node1);
    myStructure.addNode(node2);
    myStructure.addNode(node3);
    myStructure.addNode(compositeCode4);
    myStructure.addNode(node5);
    myStructure.addNode(compositeNode6);

    // When
    int x = myStructure.count();

    // Then
    assertEquals(6, x);
  }

  @Test
  public void testShouldCreateEmptyListOfNodes() {

    // When
    int x = myStructure.count();

    // Then
    assertEquals(0, x);
  }
}
