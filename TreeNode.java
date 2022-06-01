/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playoff.predictor;

/**
 *
 * @author home
 */
public class TreeNode<Team>
   {
      public Team value; 
      public int height;
      public TreeNode parent;
      public TreeNode left, right;
   
       public TreeNode(Team initValue)
      { 
         value = initValue; 
         left = null; 
         right = null; 
         parent = null;
      }
   
       public TreeNode(Team initValue, TreeNode<Team> initLeft, TreeNode<Team> initRight, TreeNode<Team> parent)
      { 
         value = initValue; 
         left = initLeft; 
         right = initRight; 
      }
   
       public Team getValue()
      { 
         return value; 
      }
   
       public TreeNode<Team> getLeft() 
      { 
         return left; 
      }
   
       public TreeNode<Team> getRight() 
      { 
         return right; 
      }
   
       public void setValue(Team theNewValue) 
      { 
         value = theNewValue; 
      }
   
       public void setLeft(TreeNode<Team> theNewLeft) 
      { 
         left = theNewLeft;
      }
   
       public void setRight(TreeNode<Team> theNewRight)
      { 
         right = theNewRight;
      }

    public TreeNode<Team> getParent() {
        return parent;
    }

    public void setParent(TreeNode<Team> parent) {
        this.parent = parent;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }       
       
    public String toString() {
        return value.toString();
    }
   }
