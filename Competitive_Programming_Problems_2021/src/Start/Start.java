package Start;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import Array.Find_Greater_No_After_Reverse;
import Array.Find_Majority_ELement_In_A_Array;
import Array.Find_Min_Distance_Between_Two_Elements;
import Array.Find_Two_Repeating_Elements_In_A_Given_Array;
import Array.Find_Union_And_intersection_Of_Two_Array;
import Array.Print_Leaders_In_A_Array;
import BinarySearchTree.Check_If_A_Tree_Is_A_Binary_Search_Tree_Or_Not;
import BinarySearchTree.Convert_A_Binary_Tree_To_Binary_Search_Tree;
import BinarySearchTree.Convert_BST_To_Sum_Of_All_Smaller_Keys;
import BinarySearchTree.Convert_Sorted_Array_To_Binary_Search_Tree;
import BinarySearchTree.Count_Nodes_In_A_Given_Binary_Search_Tree;
import BinarySearchTree.Create_Max_Min_Size_Sum_Find_Functions_In_A_BST;
import BinarySearchTree.Delete_Node_In_A_Binary_Tree;
import BinarySearchTree.Find_And_Print_Target_Sum_In_A_BST_Using_Find_Method;
import BinarySearchTree.Find_Kth_Largest_Element_In_A_BST;
import BinarySearchTree.Find_Kth_Smallest_Element_In_A_BST;
import BinarySearchTree.Find_Lowest_Common_Ancestor_In_A_BST;
import BinarySearchTree.Find_Predecessor_And_Successor_In_A_BST_Using_InOrder_Traversal;
import BinarySearchTree.Implement_A_Binary_Tree;
import BinarySearchTree.In_BST_Replace_Node_Value_With_Sum_Of_Larger_BST_Node_Value;
import BinarySearchTree.Insert_A_Node_In_A_Binary_Search_Tree;
import BinarySearchTree.Merge_Two_BBST_Return_A_In_Ordered_List;
import BinarySearchTree.Print_Keys_In_A_Given_Range_In_A_BST;
import BinarySearchTree.Search_Key_In_A_Binary_Search_Tree;
import BinarySearchTree.Search_Min_And_Max_Element_In_A_Binary_Search_Tree;
import BinarySearchTree.Traverse_Binary_Tree_Using_In_Order_Traversal;
import BinarySearchTree.Traverse_Binary_Tree_Using_Level_Order_Traversal;
import BinarySearchTree.Traverse_Binary_Tree_Using_Post_Order_Traversal;
import BinarySearchTree.Traverse_Binary_Tree_Using_Pre_Order_Traversal;
import BinaryTree.Construct_A_Binary_Tree_From_An_Array;
import BinaryTree.Display_A_Binary_Tree;
import BinaryTree.Find_Height_Of_A_Binary_Tree;
import BinaryTree.Implement_A_Binary_Search_Tree;
import BinaryTree.Iterative_InOrder_PreOrder_PostOrder_Traversal;
import BinaryTree.Level_Order_Traversal_In_A_Binary_Tree;
import Data_Structure_And_Algorithms_Level_Up_Course_Udemy.FizzBuzz;
import Data_Structure_And_Algorithms_Level_Up_Course_Udemy.Pairs;
import DynamicProgramming.Coin_ChangeProblem_Max_No_Of_Ways_Using_Memoization;
import DynamicProgramming.Coin_ChangeProblem_Max_No_Of_Ways_Using_Recursion;
import DynamicProgramming.Coin_ChangeProblem_Max_No_Of_Ways_Using_Tabulation;
import DynamicProgramming.Coin_ChangeProblem_Min_No_Of_Coins_Using_Tabulation;
import DynamicProgramming.Count_Number_Of_Subset_With_Given_Difference_Using_Tabulation;
import DynamicProgramming.Count_Of_Given_Sum_With_A_Given_Sum_In_An_Array;
import DynamicProgramming.Count_Of_Subset_Sum_With_A_Given_Sum;
import DynamicProgramming.Count_Of_Subset_To_Get_Target_Sum;
import DynamicProgramming.FInd_If_Squence_Has_Matching_Pattern;
import DynamicProgramming.FInd_Min_No_Of_Deletion_To_Make_It_A_Palindrome;
import DynamicProgramming.Find_Equal_Sum_Partition_Problem_Using_Tabulation;
import DynamicProgramming.Find_Length_Of_Longest_COmmon_SubSequence_Using_Recursion;
import DynamicProgramming.Find_Length_Of_Longest_Common_SubSequence_Using_Memoization;
import DynamicProgramming.Find_Length_Of_Longest_Common_SubSequence_Using_Tabulation;
import DynamicProgramming.Find_Length_Of_Longest_Common_SubString_Using_Memoization;
import DynamicProgramming.Find_Length_Of_Longest_Common_SubString_Using_Recursion;
import DynamicProgramming.Find_Length_Of_Longest_Common_SubString_Using_Tabulation;
import DynamicProgramming.Find_Length_Of_Longest_palindromic_SubSequence;
import DynamicProgramming.Find_Length_Of_Shortest_Common_SuperSequence;
import DynamicProgramming.Find_Length_Of_longest_repeating_SubSequence;
import DynamicProgramming.Find_Longest_Common_Subsequence_In_A_String;
import DynamicProgramming.Find_Minimum_Subset_Sum_Difference_Using_Tabulation;
import DynamicProgramming.Find_Nth_Fibonacci_Number;
import DynamicProgramming.Max_Price_In_Rod_Cutting_Problem_Usin_Recursion;
import DynamicProgramming.Max_Price_In_Rod_Cutting_Problem_Using_Memoization;
import DynamicProgramming.Max_Price_In_Rod_Cutting_Problem_Using_Tabulation;
import DynamicProgramming.Max_Profit_In_Knapsack_Problem_Using_Recursion;
import DynamicProgramming.Max_Profit_In_Knapsack_Problem_Using_Tabulation;
import DynamicProgramming.Max_Profit_In_Knapsack_Problem_Using_Memoization;
import DynamicProgramming.Max_profit_In_Unbounded_Knapsack_Problem_Using_Recursion;
import DynamicProgramming.Max_profit_In_Unbounded_Knapsack_Problem_Using_Tabulation;
import DynamicProgramming.Min_Insertion_Required_To_make_It_A_Palindrome;
import DynamicProgramming.Min_No_Of_Insertion_Deletion_Required_To_Convert_String_A_To_String_B;
import DynamicProgramming.Print_Longest_Common_SubSequence_Using_Tabulation;
import DynamicProgramming.Print_Shortest_Common_SuperSequence;
import DynamicProgramming.Find_Length_Of_Longest_Common_SubString;
import DynamicProgramming.Max_profit_In_Unbounded_Knapsack_Problem_Using_Memoization;
import DynamicProgramming.Subset_Sum_Problem_Using_Tabulation;
import FamousProblems.SparseArray;
import Graph.Bipartite_Graph_Check;
import Graph.Connected_Components_Using_DFS;
import Graph.Cycle_Detection_Undirected_Graph;
import Graph.Flood_Fill;
import Graph.Implement_Depth_First_Search;
import Graph.Implement_Graph_Using_Adjacency_List;
import Graph.PuruTest;
import Graph.Single_Source_Shortest_Path;
import Graph.Snakes_And_Ladder_Using_BFS;
import Heap.Implement_A_Min_Heap;
import LinkedList.Find_Middle_Element_In_A_Linked_List;
import LinkedList.Implement_A_Linked_List;
import LinkedList.Reverse_A_Linked_List;
import Misclleneous.Calculate_Cost;
import Misclleneous.Count_No_Of_Words_In_A_File;
import Misclleneous.Implement_DFS_Using_Graph;
import Misclleneous.Implement_Flood_Fill_Using_Graph;
import Misclleneous.Mighty_Battle_HackerEarth;
import Misclleneous.Snakes_And_Ladder_Graph_Practice;
import SlidingWindow.Find_Index_Range_Whose_Element_Sum_Equals_To_K;
import SlidingWindow.Find_Longest_Unique_SubString;
import SlidingWindow.Find_Smallest_Window_That_Contains_Required_Sum;
import SortingAlgorithms.BubbleSort;
import SortingAlgorithms.Insertion_Sort;
import SortingAlgorithms.Selection_Sort;
import Stack.Check_If_Brackets_Are_Balanced_Or_Not;
import Stack.Find_Max_Element_In_A_Stack;
import Stack.Find_Nearest_Greater_Element_To_Left;
import Stack.Find_Nearest_Greater_Element_To_Right;
import Stack.Implement_A_Stack;
import String.Check_If_Strings_Are_Rotation_Of_Each_Other;
import String.Find_Most_Occured_Character_In_A_String;
import String.Most_Occured_Character_In_A_String;
import String.Print_Duplicate_Characters_From_A_Given_String;
import String.Remove_All_Duplicates_From_A_String;
import String.*;

public class Start {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
	//	printArray(Array.Reverse_The_Array.reverseArray(arr, arr.length));

		
//		Implement_Graph_Using_Adjacency_List<Integer, String> g = new Implement_Graph_Using_Adjacency_List<>();
//		g.addEdge(1, 2, "bro");
//		g.addEdge(2, 3, "sister");
//		g.addEdge(1, 3, "bro");
//		g.addEdge(1, 4, "aunt");
//		g.addEdge(4, 7, "mom");
//		g.addEdge(3, 8, "mom");
//		//g.addVertex(8);
//		
//		//g.deleteVertex(1);
//		
//		System.out.println(g);
//		
//		System.out.println(g.containsEdge(4,1));
//		
//		System.out.println();
//		
//		System.out.println(g.getVertexCount());
//		System.out.println(g.getEdgeCount());
//		
//		g.bfs(1);
//		
//		System.out.println();
//		g.dfs(4,7);
		
		
		//int[] aarr= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		//int[] aarr = {1, 4, 3, 2, 6, 7};
	//	int[] aarr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
		//Array.Min_no_of_jumps_to_reach_end_of_an_array.minJumps(aarr);
		
//		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//	    int n = a.length;  
//		print(Array.Find_Largest_Sum_Contigous_SubArray.findLargestSum(a, n));
//	
		
	//	Single_Source_Shortest_Path s = new Single_Source_Shortest_Path();
	//	s.findSingleShortestPath();
		
	//	Snakes_And_Ladder_Using_BFS s = new Snakes_And_Ladder_Using_BFS();
	//	s.getShortestPath();
		
	//	Implement_Depth_First_Search s = new Implement_Depth_First_Search();
	//	s.dfsCall();
		
	//	Connected_Components_Using_DFS s = new Connected_Components_Using_DFS();
	//	s.countConnectedGraph();
		
	//	Flood_Fill f = new Flood_Fill();
	//	f.floodFill();
		
	//	Cycle_Detection_Undirected_Graph c = new Cycle_Detection_Undirected_Graph();
	//	c.deleteCycle();
		
	//	Bipartite_Graph_Check b = new Bipartite_Graph_Check();
	//	b.isBipartite();
		
	//	Implement_A_Linked_List l = new Implement_A_Linked_List();
	//	l.create();
		
	//	Reverse_A_Linked_List r = new Reverse_A_Linked_List();
	//	r.iterative();
		
	//	Implement_A_Binary_Search_Tree b = new Implement_A_Binary_Search_Tree();
	//	b.createBinarySearchTree();
		
	//	Implement_A_Binary_Tree b = new Implement_A_Binary_Tree();
	//	b.implement();
		
	//	Find_Nth_Fibonacci_Number f = new Find_Nth_Fibonacci_Number();
	//	f.findNthFib();
		
	//	Max_Profit_In_Knapsack_Problem m = new Max_Profit_In_Knapsack_Problem();
	//	m.find_max_profi_In_knapsack_problem();
		
	//	Max_Profit_In_Knapsack_Problem_Using_Top_Down_Approach t = new Max_Profit_In_Knapsack_Problem_Using_Top_Down_Approach();
	//	t.findMaxProfit();
		
	//	Subset_Sum_Problem s = new Subset_Sum_Problem();
	//	s.findSum();
		
	//	Find_Equal_Sum_Partition_Problem f = new Find_Equal_Sum_Partition_Problem();
	//	f.hasEqualSumPartition();
		
	//	Count_Of_Given_Sum_With_A_Given_Sum_In_An_Array c = new Count_Of_Given_Sum_With_A_Given_Sum_In_An_Array();
	//	c.findCountOfSum();
		
	//	Find_Minimum_Subset_Sum_Difference m = new Find_Minimum_Subset_Sum_Difference();
	//	m.findMinSumSubsetDiff();
		
	//	Count_Number_Of_Subset_With_Given_Difference s = new Count_Number_Of_Subset_With_Given_Difference();
	//	s.givenSubsetWithGivenDifference();
		
	//	Find_Greater_No_After_Reverse f = new Find_Greater_No_After_Reverse();
	//	f.findgreater();
		
	//	Find_Most_Occured_Character_In_A_String m = new Find_Most_Occured_Character_In_A_String();
	//	m.findMostOccured();
		
	//	Max_profit_In_Unbounded_Knapsack_Problem m = new Max_profit_In_Unbounded_Knapsack_Problem();
	//	m.getMaxProfit();
		
	//	Find_Longest_Common_Subsequence_In_A_String s = new Find_Longest_Common_Subsequence_In_A_String();
	//	s.findSubsequence();
		
	//	Max_Profit_In_Knapsack_Problem_Using_Recursion m = new Max_Profit_In_Knapsack_Problem_Using_Recursion();
	//	m.solve();
		
	//	Max_Profit_In_Knapsack_Problem_Using_Memoization m = new Max_Profit_In_Knapsack_Problem_Using_Memoization();
	//	m.solve();
		
	//	Max_Profit_In_Knapsack_Problem_Using_Tabulation m = new Max_Profit_In_Knapsack_Problem_Using_Tabulation();
	//	m.solve();
		
	//	Subset_Sum_Problem_Using_Tabulation m = new Subset_Sum_Problem_Using_Tabulation();
	//	m.solve();
		
	//	Find_Equal_Sum_Partition_Problem_Using_Tabulation m = new Find_Equal_Sum_Partition_Problem_Using_Tabulation();
	//	m.solve();
		
	//	Count_Of_Subset_Sum_With_A_Given_Sum m = new Count_Of_Subset_Sum_With_A_Given_Sum();
	//	m.solve();
		
	//	Find_Minimum_Subset_Sum_Difference_Using_Tabulation f = new Find_Minimum_Subset_Sum_Difference_Using_Tabulation();
	//	f.solve();
		
	//	Max_profit_In_Unbounded_Knapsack_Problem_Using_Recursion r = new Max_profit_In_Unbounded_Knapsack_Problem_Using_Recursion();
	//	r.solve();
		
	//	Max_profit_In_Unbounded_Knapsack_Problem_Using_Memoization m = new Max_profit_In_Unbounded_Knapsack_Problem_Using_Memoization();
	//	m.solve();
		
	//	Max_profit_In_Unbounded_Knapsack_Problem_Using_Tabulation m = new Max_profit_In_Unbounded_Knapsack_Problem_Using_Tabulation();
	//	m.solve();
		
	//	Max_Price_In_Rod_Cutting_Problem_Usin_Recursion m = new Max_Price_In_Rod_Cutting_Problem_Usin_Recursion();
	//	m.solve();
		
	//	Max_Price_In_Rod_Cutting_Problem_Using_Memoization m = new Max_Price_In_Rod_Cutting_Problem_Using_Memoization();
	//	m.solve();
		
	//	Max_Price_In_Rod_Cutting_Problem_Using_Tabulation m = new Max_Price_In_Rod_Cutting_Problem_Using_Tabulation();
	//	m.solve();
		
	//	Coin_ChangeProblem_Max_No_Of_Ways_Using_Recursion m = new Coin_ChangeProblem_Max_No_Of_Ways_Using_Recursion();
	//	m.solve();
		
	//	Coin_ChangeProblem_Max_No_Of_Ways_Using_Memoization m = new Coin_ChangeProblem_Max_No_Of_Ways_Using_Memoization();
	//	m.solve();
		
	//	Coin_ChangeProblem_Max_No_Of_Ways_Using_Tabulation m = new Coin_ChangeProblem_Max_No_Of_Ways_Using_Tabulation();	
	//	m.solve();
		
	//	Find_Length_Of_Longest_COmmon_SubSequence_Using_Recursion m = new Find_Length_Of_Longest_COmmon_SubSequence_Using_Recursion();
	//	m.solve();
		
	//	Find_Length_Of_Longest_Common_SubSequence_Using_Memoization m = new Find_Length_Of_Longest_Common_SubSequence_Using_Memoization();
	//	m.solve();
		
	//	Find_Length_Of_Longest_Common_SubSequence_Using_Tabulation m = new Find_Length_Of_Longest_Common_SubSequence_Using_Tabulation();
	//	m.solve();
		
	//	Find_Length_Of_Longest_Common_SubString_Using_Recursion m = new Find_Length_Of_Longest_Common_SubString_Using_Recursion();
	//	m.solve();
		
	//	Find_Length_Of_Longest_Common_SubString_Using_Memoization m = new Find_Length_Of_Longest_Common_SubString_Using_Memoization();
	//	m.solve();
		
	//	Find_Length_Of_Longest_Common_SubString_Using_Tabulation m = new Find_Length_Of_Longest_Common_SubString_Using_Tabulation();
	//	m.solve();
		
	//	Print_Longest_Common_SubSequence_Using_Tabulation m = new Print_Longest_Common_SubSequence_Using_Tabulation();
	//	m.solve();
		
	//	Find_Length_Of_Longest_Common_SubString m = new Find_Length_Of_Longest_Common_SubString();
	//	m.solve();
		
	//	Find_Length_Of_Longest_Common_SubString m = new Find_Length_Of_Longest_Common_SubString();
	//	m.solve();
		
	//	Find_Length_Of_Shortest_Common_SuperSequence m = new Find_Length_Of_Shortest_Common_SuperSequence();
	//	m.solve();
		
	//	Min_No_Of_Insertion_Deletion_Required_To_Convert_String_A_To_String_B b = new Min_No_Of_Insertion_Deletion_Required_To_Convert_String_A_To_String_B();
	//	b.solve();
		
	//	Find_Length_Of_Longest_palindromic_SubSequence m = new Find_Length_Of_Longest_palindromic_SubSequence();
	//	m.solve();
		
	//	FInd_Min_No_Of_Deletion_To_Make_It_A_Palindrome m = new FInd_Min_No_Of_Deletion_To_Make_It_A_Palindrome();
	//	m.solve();
		
	//	Print_Shortest_Common_SuperSequence m = new Print_Shortest_Common_SuperSequence();
	//	m.solve();
		
	//	Find_Length_Of_longest_repeating_SubSequence m = new Find_Length_Of_longest_repeating_SubSequence();
	//	m.solve();
		
	//	FInd_If_Squence_Has_Matching_Pattern m = new FInd_If_Squence_Has_Matching_Pattern();
	//	m.solve();
		
	//	Min_Insertion_Required_To_make_It_A_Palindrome m = new Min_Insertion_Required_To_make_It_A_Palindrome();
	//	m.solve();
		
	//	Count_Number_Of_Subset_With_Given_Difference_Using_Tabulation m = new Count_Number_Of_Subset_With_Given_Difference_Using_Tabulation();
	//	m.solve();
		
	//	Count_Of_Subset_To_Get_Target_Sum m = new Count_Of_Subset_To_Get_Target_Sum();
	//	m.solve();
		
	//	Coin_ChangeProblem_Max_No_Of_Ways_Using_Tabulation m = new Coin_ChangeProblem_Max_No_Of_Ways_Using_Tabulation();
	//	m.solve();
		
	//	Coin_ChangeProblem_Min_No_Of_Coins_Using_Tabulation m  = new Coin_ChangeProblem_Min_No_Of_Coins_Using_Tabulation();
	//	m.solve();
		
	//	Implement_A_Binary_Tree m = new Implement_A_Binary_Tree();
	//	m.implement();
		
	//	Traverse_Binary_Tree_Using_Pre_Order_Traversal m = new Traverse_Binary_Tree_Using_Pre_Order_Traversal();
	//	m.implement();
		
	//	Traverse_Binary_Tree_Using_In_Order_Traversal m = new Traverse_Binary_Tree_Using_In_Order_Traversal();
	//	m.implement();
		
	//	Traverse_Binary_Tree_Using_Post_Order_Traversal m = new Traverse_Binary_Tree_Using_Post_Order_Traversal();
	//	m.implement();
		
	//	Delete_Node_In_A_Binary_Tree m = new Delete_Node_In_A_Binary_Tree();
	//	m.implement();
		
	//	Traverse_Binary_Tree_Using_Level_Order_Traversal m = new Traverse_Binary_Tree_Using_Level_Order_Traversal();
	//	m.implement();
		
	//	Search_Key_In_A_Binary_Search_Tree m = new Search_Key_In_A_Binary_Search_Tree();
	//	m.implement();
		
	//	Search_Min_And_Max_Element_In_A_Binary_Search_Tree m = new Search_Min_And_Max_Element_In_A_Binary_Search_Tree();
	//	m.implement();
		
	//	Find_Predecessor_And_Successor_In_A_BST_Using_InOrder_Traversal m = new Find_Predecessor_And_Successor_In_A_BST_Using_InOrder_Traversal();
	//	m.implement();
		
	//	Check_If_A_Tree_Is_A_Binary_Search_Tree_Or_Not m = new Check_If_A_Tree_Is_A_Binary_Search_Tree_Or_Not();
	//	m.implement();
		
	//	PuruTest p = new PuruTest();
	//	p.solve();
		
	//	Insert_A_Node_In_A_Binary_Search_Tree m = new Insert_A_Node_In_A_Binary_Search_Tree();
	//	m.solve();
		
	//	Delete_Node_In_A_Binary_Tree t = new Delete_Node_In_A_Binary_Tree();
	//	t.implement();
		
	//	Convert_A_Binary_Tree_To_Binary_Search_Tree m = new Convert_A_Binary_Tree_To_Binary_Search_Tree();
	//	m.solve();
		
	//	Count_Nodes_In_A_Given_Binary_Search_Tree m = new Count_Nodes_In_A_Given_Binary_Search_Tree();
	//	m.implement();
		
	//	Convert_Sorted_Array_To_Binary_Search_Tree m = new Convert_Sorted_Array_To_Binary_Search_Tree();
	//	m.implement();
		
	//	Convert_BST_To_Sum_Of_All_Smaller_Keys m = new Convert_BST_To_Sum_Of_All_Smaller_Keys();
	//	m.implement();
		
	//	Merge_Two_BBST_Return_A_In_Ordered_List m = new Merge_Two_BBST_Return_A_In_Ordered_List();
	//	m.implement();
		
	//	Find_Kth_Smallest_Element_In_A_BST b = new Find_Kth_Smallest_Element_In_A_BST();
	//	b.solve();
		
	//	Find_Kth_Largest_Element_In_A_BST b = new Find_Kth_Largest_Element_In_A_BST();
	//	b.solve();
		
	//	Find_Lowest_Common_Ancestor_In_A_BST n = new Find_Lowest_Common_Ancestor_In_A_BST();
	//	n.solve();
		
	//	Create_Max_Min_Size_Sum_Find_Functions_In_A_BST m = new Create_Max_Min_Size_Sum_Find_Functions_In_A_BST();
	//	m.solve();
		
	//	Convert_Sorted_Array_To_Binary_Search_Tree m = new Convert_Sorted_Array_To_Binary_Search_Tree();
	//	m.implement();
		
	//	In_BST_Replace_Node_Value_With_Sum_Of_Larger_BST_Node_Value m = new In_BST_Replace_Node_Value_With_Sum_Of_Larger_BST_Node_Value();
	//	m.solve();
		
	//	Print_Keys_In_A_Given_Range_In_A_BST m = new Print_Keys_In_A_Given_Range_In_A_BST();
	//	m.solve();
		
	//	Find_And_Print_Target_Sum_In_A_BST_Using_Find_Method m = new Find_And_Print_Target_Sum_In_A_BST_Using_Find_Method();
	//	m.solve();
		
	//	Find_Predecessor_And_Successor_In_A_BST_Using_InOrder_Traversal v = new Find_Predecessor_And_Successor_In_A_BST_Using_InOrder_Traversal();
	//	v.implement();
		
	//	Find_Nearest_Greater_Element_To_Right v = new Find_Nearest_Greater_Element_To_Right();
	//	v.solve();
		
	//	Find_Nearest_Greater_Element_To_Left l = new Find_Nearest_Greater_Element_To_Left();
	//	l.solve();
		
	//	Calculate_Cost c = new Calculate_Cost();
	//	c.solve();
		
	//	Mighty_Battle_HackerEarth m = new Mighty_Battle_HackerEarth();
	//	m.solve();
		
	//	Implement_A_Linked_List l =new Implement_A_Linked_List();
	//	l.solve();
		
	//	Count_No_Of_Words_In_A_File m = new Count_No_Of_Words_In_A_File();
	//	m.solve();
		
	//	Most_Occured_Character_In_A_String m = new Most_Occured_Character_In_A_String();
	//	m.solve();
		
	//	Remove_All_Duplicates_From_A_String m = new Remove_All_Duplicates_From_A_String();
	//	m.solve();
		
	//	Print_Duplicate_Characters_From_A_Given_String m = new Print_Duplicate_Characters_From_A_Given_String();
	//	m.solve();
		
	//	Print_Duplicate_Characters_From_A_Given_String g = new Print_Duplicate_Characters_From_A_Given_String();
	//	g.solve();
		
	//	Check_If_Strings_Are_Rotation_Of_Each_Other l = new Check_If_Strings_Are_Rotation_Of_Each_Other();
	//	l.solve();
		
	//	Reverse_Words_In_A_Given_String n = new Reverse_Words_In_A_Given_String();
	//	n.solve();
		
	//	Implement_A_Min_Heap m = new Implement_A_Min_Heap();
	//	m.implement();
		
	//	Convert_Integer_To_Roman_Values o = new Convert_Integer_To_Roman_Values();
	//	o.solve();
		
	//	Implement_A_Stack  n = new Implement_A_Stack();
	//	n.implement();
		
	//	Snakes_And_Ladder_Graph_Practice p = new Snakes_And_Ladder_Graph_Practice();
	//	p.solve();
		
	//	Implement_DFS_Using_Graph t = new Implement_DFS_Using_Graph();
	//	t.dfsCall();
		
	//	Implement_Flood_Fill_Using_Graph g = new Implement_Flood_Fill_Using_Graph();
	//	g.floodFill();
		
	//	Find_Union_And_intersection_Of_Two_Array m = new Find_Union_And_intersection_Of_Two_Array();
	//	m.solve();
		
	//	Find_Min_Distance_Between_Two_Elements s = new Find_Min_Distance_Between_Two_Elements();
	//	s.solve();
		
	//	Print_Leaders_In_A_Array m = new Print_Leaders_In_A_Array();
	//	m.solve();
		
	//	Find_Majority_ELement_In_A_Array m = new Find_Majority_ELement_In_A_Array();
	//	m.solve();
		
	//	Selection_Sort m = new Selection_Sort();
	//	m.sort();
		
	//	BubbleSort b = new BubbleSort();
	//	b.sort();
		
	//	Insertion_Sort m = new Insertion_Sort();
	//	m.sort();
		
	//	Find_Middle_Element_In_A_Linked_List l = new Find_Middle_Element_In_A_Linked_List();
	//	l.solve();
		
	//	FizzBuzz f = new FizzBuzz();
	//	f.solve();
		
	//	Pairs p = new Pairs();
	//	p.solve();
		
	//	Find_Two_Repeating_Elements_In_A_Given_Array a = new Find_Two_Repeating_Elements_In_A_Given_Array();
	//	a.solve();
		
	//	Find_Index_Range_Whose_Element_Sum_Equals_To_K k = new Find_Index_Range_Whose_Element_Sum_Equals_To_K();
	//	k.solve();
		
	//	Find_Smallest_Window_That_Contains_Required_Sum l = new Find_Smallest_Window_That_Contains_Required_Sum();
	//	l.solve();
		
	//	Find_Longest_Unique_SubString l = new Find_Longest_Unique_SubString();
	//	l.solve();
		
	//	Find_Longest_Unique_SubString g = new Find_Longest_Unique_SubString();
	//	g.solve();
		
	//	Check_If_Brackets_Are_Balanced_Or_Not c = new Check_If_Brackets_Are_Balanced_Or_Not();
	//	c.solve();
		
	//	SparseArray s = new SparseArray();
	//	s.solve();
		
	//	Find_Max_Element_In_A_Stack s = new Find_Max_Element_In_A_Stack();
	//	s.solve();
		
	//	Construct_A_Binary_Tree_From_An_Array m = new Construct_A_Binary_Tree_From_An_Array();
	//	m.solve();
		
	//	Display_A_Binary_Tree m = new Display_A_Binary_Tree();
	//	m.solve();
		
	//	Find_Height_Of_A_Binary_Tree p = new Find_Height_Of_A_Binary_Tree();
	//	p.solve();
		
	//	Level_Order_Traversal_In_A_Binary_Tree m = new Level_Order_Traversal_In_A_Binary_Tree();
	//	m.solve();
		
		Iterative_InOrder_PreOrder_PostOrder_Traversal l = new Iterative_InOrder_PreOrder_PostOrder_Traversal();
		l.solve();
		
		
		
		
		
		
		
		
		

	}
	

	
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void print(int arr) {
			System.out.println(arr + " ");
	}
	
	
	



}
