package stream.homework;

import stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgNumberOfPostsForElders = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Number of posts for ppl over 40" + avgNumberOfPostsForElders);

        double avgNumberOfPostsForYoungsters = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Number of posts for ppl under 40" + avgNumberOfPostsForYoungsters);

    }
}
