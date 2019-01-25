public class Node
{
   Object data;

   Node left;
   Node right;
   
   // Node constructor
   Node(Object datavl)
   {
     data = datavl;
     left = null;
     right = null;
   }
   
   Node(Node nd)
   {
      data = nd.data;
      left = nd.left;
      right = nd.right;
   }

   Node GetLeft()
   {
      return left;
   }

   Node getRight()
   {
      return right;
   }

   public void setData(Object dataValue) 
   {
      data = dataValue;
   }

   public Object getData() 
   {
      return data;
   }

   void SetLeft(Node LeftNode)
   {
       left = LeftNode;
   }
   
   void SetRight(Node LeftRight)
   {
       right = LeftRight;
   }
}