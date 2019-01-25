public class BTree
{
  private Node root;

  public BTree()
  {
     root = null;
  }

  public void insert_node(Object data)
  {
    if(root == null)
    {
      root = new Node(data);
    }
    else
    {
        Node node = root;
        Node last_node = node;
      
        while(node != null)
        {
             last_node = node;
            
            if( (int) data > (int) node.getData() )
            {
               node = node.getRight();
            }
            else
            {
               node = node.GetLeft();
            } 
        }
        
        Node new_node = new Node(data);

        if( (int) data > (int) last_node.getData() )
        {
           last_node.SetRight(new_node);
        }
        else
        {
           last_node.SetLeft(new_node);
        }
    }
  }
  
  public Node find_node(Object value)
  {
     Node node = root;
    
     while(node != null)
     {
        if( (int) node.getData() == (int) value )
        {
           return node;
        }
        
        if( (int) value > (int) node.getData() )
        {
           node = node.getRight();
        }
        else
        {
           node = node.GetLeft();
        }  
     }
     
     return null;
    
   }
}