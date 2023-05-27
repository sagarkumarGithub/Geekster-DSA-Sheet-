public static Node lca(Node root, int v1, int v2) {
    // Write your code here.
  Node lca = root;
  
  while(lca != null){
      if(v1 > lca.data && v2 > lca.data){
          //1.right
          lca = lca.right;
      }else if(v1 < lca.data && v2 < lca.data){
          //2.left
          lca = lca.left;
      }else{
          return lca;
      }
  }
  return null;
}
