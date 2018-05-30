package com.amazingReader.mapper;

import com.amazingReader.entity.ChapterAdditionRemarks;

public interface ChapterAdditionRemarksMapper {
	public int getMaxIndex();
	public boolean add(ChapterAdditionRemarks additionRemarks);
	public boolean alter(ChapterAdditionRemarks additionRemarks);
	public boolean removeByChapterId(int bookChapterId);
	public boolean remove(ChapterAdditionRemarks chapterAdditionRemarks);
	public ChapterAdditionRemarks getChapterAdditionBy(int bookChapterId);
}