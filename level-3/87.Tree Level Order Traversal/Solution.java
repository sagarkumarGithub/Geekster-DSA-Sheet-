public static void levelOrder(Node root) {
    Queue<Node> que = new LinkedList<>();
    que.add(root);
    
    while(que.size() != 0){
        //remove
        Node rem = que.remove();
        
        //work
        System.out.print(rem.data + " ");
        
        //add
        if(rem.left != null){
            que.add(rem.left);
        }
        
        if(rem.right != null){
            que.add(rem.right);
        }
    }
  
}
