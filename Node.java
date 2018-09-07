import java.util.*;
public class Node
{
    Date timestamp;
    String data;
    static int nodeNumber=0;
    String nodeId;
    String referenceNodeId;
    //ArrayList<String> childReferenceNodeId;
    String genesisReferenceNodeId;
    String hashValue;
    
    public Node(Date timestamp, String nodeId, String referenceNodeId,
    ArrayList<String> childReferenceNodeId, String genesisReferenceNodeId,
    String hashValue){
        
        this.timestamp=timestamp;
        this.nodeId=nodeId;
        this.referenceNodeId=referenceNodeId;
        ArrayList<String> childReferenceNodeId=new ArrayList<>();
        this.genesisReferenceNodeId=referenceNodeId;
        this.hashValue=hashValue;
        nodeNumber++;
    }
    
    public createChild(String childData){
        childReferenceNodeId.add(childData);
    }
	public static void main(String[] args) {
	}
}
