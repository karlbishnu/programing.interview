package net.bishnu.leetcode.evaluateDivisions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 399. Evaluate Division
 * https://leetcode.com/problems/evaluate-division/description/
 */
public class EvaluateDivision {
    public double[] clacEquations(String[][] equations, double[] values, String[][] queries){
        Map<String, Map<String, Double>> cg = buildGraph(equations, values);
        double[] ans = new double[queries.length];
        Arrays.setAll(ans, i->-1);
        for(int i=0; i<queries.length; i++){
            String from = queries[i][0];
            String to = queries[i][1];
            if(!cg.containsKey(from) || !cg.containsKey(to))    continue;
            ans[i] = dfs(cg, from, to);
        }
        return ans;
    }

    private double dfs(Map<String, Map<String, Double>> cg, String from, String to) {
        return dfs(cg, from, to, new HashSet<String>());
    }

    private double dfs(Map<String, Map<String, Double>> cg, String from, String to, HashSet<String> visited) {
        if(from.equals(to)) return 1.0;
        Map<String, Double> edges = cg.get(from);
        double ans = -1.0;
        for(String node: edges.keySet()){
            if(visited.contains(node))  continue;
            visited.add(node);
            double value = dfs(cg, node, to, visited);
            if(value != -1.0){
                ans=edges.get(node)*value;
                break;
            }
        }
        return ans;
    }

    private Map<String, Map<String, Double>> copyMap(Map<String, Map<String, Double>> cg) {
        Map<String, Map<String, Double>> copy = new HashMap<>(cg);
        for(String key: copy.keySet()){
            copy.put(key, new HashMap<>(copy.get(key)));
        }
        return copy;
    }

    private Map<String, Map<String, Double>> buildGraph(String[][] eqs, double[] values) {
        Map<String, Map<String, Double>> cg = new HashMap<>();
        if(eqs==null || values==null)   return cg;
        for(int i=0; i<eqs.length; i++){
            String n=eqs[i][0], d=eqs[i][1];
            Map<String, Double> edges = getEdges(cg, n);
            edges.put(d, values[i]);
            edges = getEdges(cg, d);
            edges.put(n, 1/values[i]);
        }
        return cg;
    }

    private Map<String, Double> getEdges(Map<String, Map<String, Double>> cg, String n) {
        Map<String, Double> edges;
        if(!cg.containsKey(n))  cg.put(n, (edges=new HashMap<>()));
        else    edges = cg.get(n);
        return edges;
    }
}
