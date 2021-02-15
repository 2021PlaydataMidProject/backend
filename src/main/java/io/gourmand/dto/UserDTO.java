package io.gourmand.dto;

import java.time.LocalDate;
import java.util.List;

import io.gourmand.domain.Followers;
import io.gourmand.domain.ListLikes;
import io.gourmand.domain.Reply;
import io.gourmand.domain.Res;
import io.gourmand.domain.ReviewLikes;
import io.gourmand.domain.User;
import io.gourmand.domain.UserImg;
import io.gourmand.domain.UserStandard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class UserDTO {

// 전체 User table 객체명
	
//	private Long userNum;
//	private String userId;
//	private List<Followers> followers;
//	private List<Followers> following;
//	private String pw;
//	private String name;
//	private String dob;
//	private String job;
//	private int pageStatus;
//	private LocalDate suDate;
//	private UserStandard userStandard;	
//	private List<Reply> reply; 
//	private List<UserImg> userImg;
//	private List<ReviewLikes> reviewLikes;
//	private List<ListLikes> listLikes;

	
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	public static class SigninRequest {
		private String userId;
		private String pw;

		public static SigninRequest of(User user) {
			return SigninRequest.builder().userId(user.getUserId()).pw(user.getPw()).build();
		}
	}

	

	
	
	// 회원가입을 위한 DTO - 이미지 관련 추가, 날짜/드롭다운 등 변경 필요
	@AllArgsConstructor
	@NoArgsConstructor
	@Getter
	@Setter
	@Builder
	public static class UserRegister {
		private String userId;
		private String pw;
		private String name;
		private String dob;
		private String job;
		private int pageStatus;

		public static User toEntity(UserRegister user) {
			return User.builder()
					.userId(user.getUserId())
					.pw(user.getPw())
					.name(user.getName())
					.dob(user.getDob())
					.job(user.getJob())
					.pageStatus(user.getPageStatus())
					.build();
		}
	}

	
	// 회원 1인의 전체 정보 불러오기 - // thread 컬럼명 Reply로 변경
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	public static class UserInfo {
		private Long userNum;
		private String userId;
		private List<Followers> followers;
		private List<Followers> following;
		private String pw;
		private String name;
		private String dob;
		private String job;
		private int pageStatus;
		private LocalDate suDate;
		private UserStandard userStandard;	
		private List<Reply> reply; 
		private List<UserImg> userImg;
		private List<ReviewLikes> reviewLikes;
		private List<ListLikes> listLikes;

		
		public static UserInfo of(User user) {
			return UserInfo.builder()
					.userNum(user.getUserNum())
					.userId(user.getUserId())
					.followers(user.getFollowers())
					.followers(user.getFollowing())
					.pw(user.getPw())
					.name(user.getName())
					.job(user.getJob())
					.pageStatus(user.getPageStatus())
					.suDate(user.getSuDate())
					.userStandard(user.getUserStandard())
					.reply(user.getReply())
					.userImg(user.getUserImg())
					.reviewLikes(user.getReviewLikes())
					.listLikes(user.getListLikes())
					.build();
		}
	}
	
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	public static class IdCheckResult {
		private boolean isExist;
	}
	
//	@Getter
//	   @Setter
//	   @NoArgsConstructor
//	   @AllArgsConstructor
//	   @Builder
//	   public static class UserInfoEditRequest{
//	      private String name;
//	      private String pw;
//	      private String job;
//	      private int pageStatus;
//	      private UserStandard userStandard;//확실히 모르겠음 찾아보기 
//	   }
}