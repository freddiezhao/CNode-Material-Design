package org.cnodejs.android.md.ui.view;

import org.cnodejs.android.md.model.entity.Result;

public interface ITopicHeaderView {

    boolean onCollectTopicResultOk(Result result);

    boolean onDecollectTopicResultOk(Result result);

}
