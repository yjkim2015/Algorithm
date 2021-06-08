package com.algorithm.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Input : beginWord ="hit", endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * 
 * Output : 5
 * "hit" -> "hot" -> "dot"-> "dog" -> "cog"
 * 시작단어와 목표단어가 주어집니다. 시작단어에서 한글자씩 임의로 바꿀 수 있습니다. 단, 그 단어는 주어진 사전에 있어야 하는 단어입니다.

   가장 짧은 경로를 찾았을 때 거쳐간 단어수를 출력하세요
 * @author kyj
 *
 */
public class WordLadder {
	
	public static void main(String[] args) {
		String[] words = {"hot", "dot", "lot", "log", "cog"};
	
		List<String> wordList = Arrays.asList(words);
		
		WordLadder a = new WordLadder();
		
		System.out.println(a.ladderLength_neighbor("hit","cog", wordList));
	}
	
	public int ladderLength_neighbor(String beginWord, String endWord, List<String> wordList) {
		if ( wordList == null || ! wordList.contains(endWord) ) 
			return 0;
		
		Queue<String> queue = new LinkedList<>();
		Set<String> dict = new HashSet<>(wordList);
		queue.offer(beginWord);
		dict.add(endWord);
		dict.remove(beginWord);
		int level = 1;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			for ( int i = 0; i < size; i++ ) {
				String str = queue.poll();
				if ( str.equals(endWord) ) return level;
				for ( String neighbor : neighbors(str, wordList) ) {
					queue.offer(neighbor);
				}
			}
			level++;
		}
		return level;
	}
	
	public List<String> neighbors(String s, List<String> wordList) {
		List<String> res = new LinkedList<String>();
		Set<String> dict = new HashSet<>(wordList);
		
		for ( int i = 0; i < s.length(); i++ ) {
			char[] chars = s.toCharArray();
			for ( char ch = 'a'; ch <= 'z'; ch++ ) {
				chars[i] = ch;
				String word = new String(chars);
				if ( dict.remove(word) ) {
					res.add(word);
				}
			}
		}
		return res;
	}
}
