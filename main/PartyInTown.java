package main;
import java.io.*;
import java.util.*;

public class PartyInTown {
	public static void main(String[] args) throws IOException {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(in.readLine());
		while(t-- >0){
			int N=Integer.parseInt(in.readLine());
		ArrayList<ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N+1;i++){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		adj.add(arr);
		}
		for(int i=0;i<N-1;i++){
			String a[] = in.readLine().trim().split("\\s+");
			int x=Integer.parseInt(a[0]);
			int y=Integer.parseInt(a[1]);
			adj.get(x).add(y);
			adj.get(y).add(x);
		}
		System.out.println(partyHouse(N,adj));
		}
	}
		static int partyHouse(int N, ArrayList<ArrayList<Integer>> adj)
		{
			// code here
			int minimumlongestDistance=N;
			int [] farthestDistanceOfCurrent= new int[1];
			for(int i=1;i<=N;i++){
				farthestDistanceOfCurrent[0]=0;
				dfs(adj,i,-1,farthestDistanceOfCurrent,0);
				minimumlongestDistance=Math.min(minimumlongestDistance,farthestDistanceOfCurrent[0]);
			}
			
			return minimumlongestDistance;
		}
		static void dfs(ArrayList<ArrayList<Integer>> adj,int node,int parent,
		                int [] farthestDistanceOfCurrent,int currentDistance){
			farthestDistanceOfCurrent[0]=Math.max(farthestDistanceOfCurrent[0],currentDistance);
			ArrayList<Integer> children = adj.get(node);
			for(Integer child:children){
				if(child!=parent){
					dfs(adj,child,node,farthestDistanceOfCurrent,currentDistance+1);
				}
			}
		}
	}