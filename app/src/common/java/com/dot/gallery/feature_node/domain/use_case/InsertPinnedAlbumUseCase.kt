/*
 * SPDX-FileCopyrightText: 2023 IacobIacob01
 * SPDX-License-Identifier: Apache-2.0
 */

package com.dot.gallery.feature_node.domain.use_case

import com.dot.gallery.feature_node.domain.model.Album
import com.dot.gallery.feature_node.domain.model.PinnedAlbum
import com.dot.gallery.feature_node.domain.repository.MediaRepository
import javax.inject.Inject

class InsertPinnedAlbumUseCase @Inject constructor(
    private val repository: MediaRepository
) {

    suspend operator fun invoke(
        album: Album
    ) = repository.insertPinnedAlbum(PinnedAlbum(album.id))
}