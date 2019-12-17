public class FindJudge {
	//leetcode 997.找到小镇的法官

	//法官不相信任何人，说明法官不存在出度
	//所有人都信任法官，说明法官的信任度为N-1
	public int findJudge(int N, int[][] trust) {

		int[] cnt = new int[N + 1]; //统计每个人的信任度
		for (int[] index : trust) {
			//第一组信任对的第一个人相信第二个人，他自己的信任度-1
			cnt[index[0]]--;
			//第一组信任对的第二个人有人相信他，他自己的信任度+1
			cnt[index[1]]++;
		}
		for (int i = 1; i <= N; i++) { //遍历小镇上的每一个人
			//如果那个人的信任度为N - 1，则这个人就是法官
			if (cnt[i] == N-1)
				return i;
		}
		//否则返回-1；
		return -1;
	}
}
