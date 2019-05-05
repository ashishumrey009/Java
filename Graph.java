package com.java.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	private class Vertex{
		HashMap<String,Integer> nbrs =new HashMap<>();
	}
	
	HashMap<String,Vertex> vtcs ;
	public Graph() {
		vtcs=new HashMap<>();
	}
	
	public boolean conatinsVertex(String vname) {
		return this.vtcs.containsKey(vname);
		
	}
	
	public int numVertex() {
		
		return this.vtcs.size();
				
	}
	
	public void addVertex(String vname) {
		
		Vertex vtx = new Vertex();
		vtcs.put(vname,vtx);
	}
	
	public void removeVertex(String vname) {
		
		Vertex vtx = vtcs.get(vname);
		
		ArrayList<String> keys =  new ArrayList<String>(vtx.nbrs.keySet());
		
		for(String key : keys) {
			Vertex nbrVtx = vtcs.get(key);
			nbrVtx.nbrs.remove(vname);
		}
		
		vtcs.remove(vname);
	}
	
	public int numEdges() {
		int count =0;
		ArrayList<String> keys = new ArrayList<>(vtcs.keySet());
		for (String key : keys) {
			Vertex vtx = vtcs.get(key);
			count =count + vtx.nbrs.size();
		}
		return count/2;
	}
	
	public boolean containsEdge(String vname1 ,String vname2) {
		Vertex vtx1 = vtcs.get(vname1);
		Vertex vtx2 = vtcs.get(vname2);
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		
		return true;
	}
	
	
	public void addEdge(String vname1,String vname2,int cost) {
		Vertex vtx1 = vtcs.get(vname1);
		Vertex vtx2 = vtcs.get(vname2);
		if(vtx1==null || vtx2==null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}
	
	public void removeEdge(String vname1,String vname2) {
		
		Vertex vtx1 = vtcs.get(vname1);
		Vertex vtx2 = vtcs.get(vname2);
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
		
	}
	
	public void display() {
		System.out.println("---------------------------");
		ArrayList<String> keys =  new ArrayList<String>(vtcs.keySet());
		
		for(String key :keys) {
			Vertex vtx =vtcs.get(key);
			System.out.println(key +" "+ vtx.nbrs);
		}
		System.out.println("---------------------------");
	}
	
	public boolean hasPath(String vname1,String vname2,HashMap<String,Boolean>processed) {
		
		processed.put(vname1, true);
		if(containsEdge(vname1, vname2)) {
			return true;
		}
		
		Vertex vtx = vtcs.get(vname1);
		ArrayList<String> nbrs =  new ArrayList<String>(vtx.nbrs.keySet());
		for(String nbr :nbrs) {
			if( !processed.containsKey(nbr) &&   hasPath(nbr, vname2,processed)) {
				return true;
			}
		}
		return false;
	}
	
	private class Pair{
		String vname;
		String psf;
	}
	
	public boolean bfs(String src,String dst) {
		HashMap<String,Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<Pair>();
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		
		queue.addLast(sp);
		while(!queue.isEmpty()) {
			Pair pr = queue.removeFirst();
		//	System.out.println(pr.psf);
			if(processed.containsKey(pr.vname)) {
				continue;
			}
			
			processed.put(pr.vname, true);
			if(containsEdge(pr.vname, dst)) {
				System.out.println(pr.psf + dst);
				return true;
			}
			
			Vertex rpvtx = vtcs.get(pr.vname);
			ArrayList<String> nbrs =  new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr : nbrs) {
				if(!processed.containsKey(nbr))	{
					Pair np = new Pair();
					
					np.vname = nbr;
					np.psf = pr.psf + nbr;
					queue.addLast(np);
					
				}		}
		}
		return false;
		
	}
	public boolean dfs(String src,String dst) {
		HashMap<String,Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<Pair>();
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		
		stack.addFirst(sp);
		while(!stack.isEmpty()) {
			Pair pr = stack.removeFirst();
		//	System.out.println(pr.psf);
			if(processed.containsKey(pr.vname)) {
				continue;
			}
			
			processed.put(pr.vname, true);
			if(containsEdge(pr.vname, dst)) {
				System.out.println(pr.psf + dst);
				return true;
			}
			
			Vertex rpvtx = vtcs.get(pr.vname);
			ArrayList<String> nbrs =  new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr : nbrs) {
				if(!processed.containsKey(nbr))	{
					Pair np = new Pair();
					
					np.vname = nbr;
					np.psf = pr.psf + nbr;
					stack.addFirst(np);
					
				}		}
		}
		return false;
		
	}
	public void bft() {
		HashMap<String,Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<Pair>();
		ArrayList<String> keys =  new ArrayList<String>(vtcs.keySet());
		
		for(String key:keys) {
			if(processed.containsKey(key)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			
			queue.addLast(sp);
			while(!queue.isEmpty()) {
				Pair pr = queue.removeFirst();
			//	System.out.println(pr.psf);
				if(processed.containsKey(pr.vname)) {
					continue;
				}
				
				processed.put(pr.vname, true);
				
				System.out.println(pr.vname +" "+ "via "+pr.psf);
				Vertex rpvtx = vtcs.get(pr.vname);
				ArrayList<String> nbrs =  new ArrayList<>(rpvtx.nbrs.keySet());
				
				for(String nbr : nbrs) {
					if(!processed.containsKey(nbr))	{
						Pair np = new Pair();
						
						np.vname = nbr;
						np.psf = pr.psf + nbr;
						queue.addLast(np);
						
					}		}
			}
		}
		
		
	}
	public void dft() {
		HashMap<String,Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<Pair>();
		ArrayList<String> keys =  new ArrayList<String>(vtcs.keySet());
		
		for(String key:keys) {
			if(processed.containsKey(key)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			
			stack.addFirst(sp);
			while(!stack.isEmpty()) {
				Pair pr = stack.removeFirst();
			//	System.out.println(pr.psf);
				if(processed.containsKey(pr.vname)) {
					continue;
				}
				
				processed.put(pr.vname, true);
				
				System.out.println(pr.vname +" "+ "via "+pr.psf);
				Vertex rpvtx = vtcs.get(pr.vname);
				ArrayList<String> nbrs =  new ArrayList<>(rpvtx.nbrs.keySet());
				
				for(String nbr : nbrs) {
					if(!processed.containsKey(nbr))	{
						Pair np = new Pair();
						
						np.vname = nbr;
						np.psf = pr.psf + nbr;
						stack.addFirst(np);
						
					}		}
			}
		}
		
		
	}
	public boolean isCycle() {
		HashMap<String,Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<Pair>();
		ArrayList<String> keys =  new ArrayList<String>(vtcs.keySet());
		
		for(String key:keys) {
			if(processed.containsKey(key)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			
			stack.addFirst(sp);
			while(!stack.isEmpty()) {
				Pair pr = stack.removeFirst();
			//	System.out.println(pr.psf);
				if(processed.containsKey(pr.vname)) {
					continue;
				}
				
				processed.put(pr.vname, true);
				
				
				Vertex rpvtx = vtcs.get(pr.vname);
				ArrayList<String> nbrs =  new ArrayList<>(rpvtx.nbrs.keySet());
				
				for(String nbr : nbrs) {
					if(!processed.containsKey(nbr))	{
						Pair np = new Pair();
						
						np.vname = nbr;
						np.psf = pr.psf + nbr;
						stack.addFirst(np);
						
					}		}
			}
		}
		return false;
		
	}
	public ArrayList<ArrayList<String>> getCC() {
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		HashMap<String,Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<Pair>();
		ArrayList<String> keys =  new ArrayList<String>(vtcs.keySet());
		
		for(String key:keys) {
			if(processed.containsKey(key)) {
				continue;
			}
			ArrayList<String> subans = new ArrayList<String>();
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			
			queue.addLast(sp);
			while(!queue.isEmpty()) {
				Pair pr = queue.removeFirst();
			//	System.out.println(pr.psf);
				if(processed.containsKey(pr.vname)) {
					continue;
				}
				
				
				processed.put(pr.vname, true);
				
				//System.out.println(pr.vname +" "+ "via "+pr.psf);
				subans.add(pr.vname);
				Vertex rpvtx = vtcs.get(pr.vname);
				ArrayList<String> nbrs =  new ArrayList<>(rpvtx.nbrs.keySet());
				
				for(String nbr : nbrs) {
					if(!processed.containsKey(nbr))	{
						Pair np = new Pair();
						
						np.vname = nbr;
						np.psf = pr.psf + nbr;
						queue.addLast(np);
						
					}		}
			}
			ans.add(subans);
		}
		return ans;
		
	}
}
