package day07.test;

import day07.domain.Movie;

public class Test {
    public static void main(String[] args) {

        Movie movie1=new Movie(1,"东八区的先生们","2022",2.1,"中国大陆","喜剧","夏睿","张翰 王晓晨");
        Movie movie2=new Movie(2,"上海堡垒","2019",2.9,"中国大陆","爱情 战争 科幻","腾华涛","鹿晗 舒淇");
        Movie movie3=new Movie(3,"纯洁心灵·筑梦演艺圈","2015",2.2,"中国大陆","喜剧","毕志飞","朱一文 李彦漫");
        Movie[] movies={movie1,movie2,movie3};

        MovieService movieService=new MovieService(movies);
        movieService.start();
    }
}
