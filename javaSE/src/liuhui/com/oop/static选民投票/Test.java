package liuhui.com.oop.static选民投票;

/**
 * 模拟实现选民投票过程：
 * 有四个候选人，每个选民只允许投一次票，并且有三分之一的概率不投或者弃权
 * 并且当投票总数达到100时，就停止投票 输出总投票数 以及候选人的票数 以及结果
 *
 * @author 刘先生
 */
public class Test {
    public static void main(String[] args) {

        Candidate candidate1 = new Candidate();
        Candidate candidate2 = new Candidate();
        Candidate candidate3 = new Candidate();
        Candidate candidate4 = new Candidate();

        Candidate candidates[] = {candidate1, candidate2, candidate3, candidate4};


        while (true) {

            int random3 = (int) (Math.random() * 3);
            int random4 = (int) (Math.random() * 4);
            if (random3 != 0) {
                candidates[random4].setNum();
                Candidate.setCount();
            }
            if (Candidate.getCount() >= 100) {
                break;
            }
        }

        for (int i = 0; i < candidates.length; i++) {
            System.out.println("选民" + (i + 1) + "  票数" + candidates[i].getNum());
        }
        System.out.println("总票数" + Candidate.getCount());


    }
}
