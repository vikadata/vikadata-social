package com.vikadata.social.dingtalk.event.sync.http;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.vikadata.social.dingtalk.annotation.DingTalkEvent;
import com.vikadata.social.dingtalk.enums.DingTalkEventTag;
import com.vikadata.social.dingtalk.enums.DingTalkSyncAction;

@Setter
@Getter
@ToString
@DingTalkEvent(value = DingTalkEventTag.SYNC_HTTP_PUSH_HIGH, action = DingTalkSyncAction.ORG_MICRO_APP_SCOPE_UPDATE)
public class OrgMicroAppScopeUpdateEvent extends BaseOrgMicroAppEvent {
}
