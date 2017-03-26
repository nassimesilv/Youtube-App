package fr.esilv.recyclerviewexample.videos.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Video {

	private String kind;
	private String etag;
	private String nextPageToken;
	private String regionCode;
	private PageInfoBean pageInfo;
	private List<ItemsBean> items;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getNextPageToken() {
		return nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public PageInfoBean getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfoBean pageInfo) {
		this.pageInfo = pageInfo;
	}

	public List<ItemsBean> getItems() {
		return items;
	}

	public void setItems(List<ItemsBean> items) {
		this.items = items;
	}

	public static class PageInfoBean {

		private int totalResults;
		private int resultsPerPage;

		public int getTotalResults() {
			return totalResults;
		}

		public void setTotalResults(int totalResults) {
			this.totalResults = totalResults;
		}

		public int getResultsPerPage() {
			return resultsPerPage;
		}

		public void setResultsPerPage(int resultsPerPage) {
			this.resultsPerPage = resultsPerPage;
		}
	}

	public static class ItemsBean {

		private String kind;
		private String etag;
		private IdBean id;
		private SnippetBean snippet;

		public String getKind() {
			return kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getEtag() {
			return etag;
		}

		public void setEtag(String etag) {
			this.etag = etag;
		}

		public IdBean getId() {
			return id;
		}

		public void setId(IdBean id) {
			this.id = id;
		}

		public SnippetBean getSnippet() {
			return snippet;
		}

		public void setSnippet(SnippetBean snippet) {
			this.snippet = snippet;
		}

		public static class IdBean {

			private String kind;
			private String videoId;

			public String getKind() {
				return kind;
			}

			public void setKind(String kind) {
				this.kind = kind;
			}

			public String getVideoId() {
				return videoId;
			}

			public void setVideoId(String videoId) {
				this.videoId = videoId;
			}
		}

		public static class SnippetBean {

			private String publishedAt;
			private String channelId;
			private String title;
			private String description;
			private ThumbnailsBean thumbnails;
			private String channelTitle;
			private String liveBroadcastContent;

			public String getPublishedAt() {
				return publishedAt;
			}

			public void setPublishedAt(String publishedAt) {
				this.publishedAt = publishedAt;
			}

			public String getChannelId() {
				return channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public ThumbnailsBean getThumbnails() {
				return thumbnails;
			}

			public void setThumbnails(ThumbnailsBean thumbnails) {
				this.thumbnails = thumbnails;
			}

			public String getChannelTitle() {
				return channelTitle;
			}

			public void setChannelTitle(String channelTitle) {
				this.channelTitle = channelTitle;
			}

			public String getLiveBroadcastContent() {
				return liveBroadcastContent;
			}

			public void setLiveBroadcastContent(String liveBroadcastContent) {
				this.liveBroadcastContent = liveBroadcastContent;
			}

			public static class ThumbnailsBean {

				@SerializedName("default")
				private DefaultBean defaultX;
				private MediumBean medium;
				private HighBean high;

				public DefaultBean getDefaultX() {
					return defaultX;
				}

				public void setDefaultX(DefaultBean defaultX) {
					this.defaultX = defaultX;
				}

				public MediumBean getMedium() {
					return medium;
				}

				public void setMedium(MediumBean medium) {
					this.medium = medium;
				}

				public HighBean getHigh() {
					return high;
				}

				public void setHigh(HighBean high) {
					this.high = high;
				}

				public static class DefaultBean {

					private String url;
					private int width;
					private int height;

					public String getUrl() {
						return url;
					}

					public void setUrl(String url) {
						this.url = url;
					}

					public int getWidth() {
						return width;
					}

					public void setWidth(int width) {
						this.width = width;
					}

					public int getHeight() {
						return height;
					}

					public void setHeight(int height) {
						this.height = height;
					}
				}

				public static class MediumBean {

					private String url;
					private int width;
					private int height;

					public String getUrl() {
						return url;
					}

					public void setUrl(String url) {
						this.url = url;
					}

					public int getWidth() {
						return width;
					}

					public void setWidth(int width) {
						this.width = width;
					}

					public int getHeight() {
						return height;
					}

					public void setHeight(int height) {
						this.height = height;
					}
				}

				public static class HighBean {

					private String url;
					private int width;
					private int height;

					public String getUrl() {
						return url;
					}

					public void setUrl(String url) {
						this.url = url;
					}

					public int getWidth() {
						return width;
					}

					public void setWidth(int width) {
						this.width = width;
					}

					public int getHeight() {
						return height;
					}

					public void setHeight(int height) {
						this.height = height;
					}
				}
			}
		}
	}
}
