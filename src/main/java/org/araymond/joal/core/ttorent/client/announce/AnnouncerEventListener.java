package org.araymond.joal.core.ttorent.client.announce;

import com.turn.ttorrent.common.protocol.TrackerMessage;
import org.araymond.joal.core.ttorent.client.bandwidth.TorrentWithStats;

/**
 * Created by raymo on 14/05/2017.
 */
public interface AnnouncerEventListener {

    void onAnnouncerWillAnnounce(final TrackerMessage.AnnounceRequestMessage.RequestEvent event, final Announcer announcer);

    void onAnnounceSuccess(final Announcer announcer);

    void onAnnounceFail(final Announcer announcer, final String error);

    void onNoMoreLeecherForTorrent(final Announcer announcer, final TorrentWithStats torrent);

    void onShouldDeleteTorrent(final Announcer announcer, final TorrentWithStats torrent);

    void onAnnouncerStart(final Announcer announcer);

    void onAnnouncerStop(final Announcer announcer);

}
