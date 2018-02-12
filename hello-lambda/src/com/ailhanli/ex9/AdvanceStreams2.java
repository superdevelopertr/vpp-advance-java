package com.ailhanli.ex9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AdvanceStreams2 {

	public static void main(String[] args) {
		List<BlogPost> blogs = new ArrayList<>();
		blogs.add(new BlogPost("blog1", "author1", BlogPostType.GUIDE, 1));
		blogs.add(new BlogPost("blog1", "author1", BlogPostType.GUIDE, 1));
		blogs.add(new BlogPost("blog2", "author1", BlogPostType.NEWS, 19));
		blogs.add(new BlogPost("blog3", "author1", BlogPostType.GUIDE, 13));
		blogs.add(new BlogPost("blog4", "author2", BlogPostType.REVIEW, 1));
		blogs.add(new BlogPost("blog5", "author3", BlogPostType.REVIEW, 2));
		blogs.add(new BlogPost("blog6", "author3", BlogPostType.NEWS, 11));
		blogs.add(new BlogPost("blog7", "author3", BlogPostType.NEWS, 10));

		Map<BlogPostType, List<BlogPost>> blogMapByType = blogs.stream()
				.collect(Collectors.groupingBy(BlogPost::getType));
		blogMapByType.entrySet().forEach((a) -> System.out.println(a.getKey() + " " + a.getValue()));

		System.out.println();
		Map<Tuple, List<BlogPost>> postsPerTypeAndAuthor = blogs.stream()
				.collect(Collectors.groupingBy(post -> new Tuple(post.getType(), post.getAuthor())));
		postsPerTypeAndAuthor.entrySet().forEach((a) -> System.out.println(a.getKey() + " " + a.getValue()));

		System.out.println();
		Map<BlogPostType, Set<BlogPost>> blogMapByTypeSet = blogs.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.toSet()));
		blogMapByTypeSet.entrySet().forEach((a) -> System.out.println(a.getKey() + " " + a.getValue()));

		System.out.println();
		Map<BlogPostType, Double> blogAvgs = blogs.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.summingDouble(BlogPost::getLikes)));
		blogAvgs.entrySet().forEach((a) -> System.out.println(a.getKey() + " " + a.getValue()));

		System.out.println();
		Map<BlogPostType,Optional<BlogPost>>  blogMaxs = blogs.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.maxBy(Comparator.comparingInt(BlogPost::getLikes))));
		blogMaxs.entrySet().forEach((a) -> System.out.println(a.getKey() + " " + a.getValue().get()));
		
		
		System.out.println();
		Map<BlogPostType, String> postsPerType = blogs.stream()
				  .collect(Collectors.groupingBy(BlogPost::getType, 
						  Collectors. mapping(BlogPost::getTitle, Collectors.joining("; ", "Post titles: {", "}"))));
		postsPerType.entrySet().forEach((a) -> System.out.println(a.getKey() + " " + a.getValue()));
		

	}

}
