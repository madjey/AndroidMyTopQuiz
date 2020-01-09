package com.myworldgame.mytopquiz.Model;

import java.util.Collections;
import java.util.List;

public class QuestionBank {

        private List<Question> mQuestionList;
        private int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;

        // Shuffle the question list
        Collections.shuffle(mQuestionList);

        mNextQuestionIndex = 0;
    }

    public Question getQuestion() {
        //  loop over the questions
        if (mNextQuestionIndex == mQuestionList.size()) {
            mNextQuestionIndex = 0;
        }

        //  note the post-incrementation
        return mQuestionList.get(mNextQuestionIndex++);
    }
}
