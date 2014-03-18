/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsaproject;

/**
 *
 * @author MILINDA
 */

public class TNode {
    
    int id;
    TNode left;
    TNode right;
    String fname;
    String sname;
    String title;
    String bname;
    
    
public TNode(int id,TNode left,TNode right){
        
        this.id = id;
        this.left = left;
        this.right = right;
        
    }

//// public Node(int id,String Name,String author,String surname,Node title,Node left,Node right){
////        
////        this.id = id;
////        this.fname=Name;
////        this.sname=author;
////        this.title=title;
////        this.left = left;
////        this.right = right;
//        
//    }
    
}
