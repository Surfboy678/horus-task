import java.util.LinkedList;
import java.util.List;

public class CompositeNode extends Node implements ICompositeNode {

    private List<INode> nodes = new LinkedList<>();

    public CompositeNode(String code, String renderer) {
        super(code, renderer);
    }

    @Override
    public List<INode> getNodes() {
        return nodes;
    }

    public void addNode(INode node){
        nodes.add(node);
    }
}
