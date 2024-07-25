package com.kh.Palette_BackEnd.repository;

import com.kh.Palette_BackEnd.entity.ChatEntity;
import com.kh.Palette_BackEnd.entity.ChatRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<ChatEntity, Long> {
    List<ChatEntity> findBySenderAndReceiverOrderByRegDateAsc(String sender, String receiver);
    List<ChatEntity> findBySenderAndReceiverOrReceiverAndSenderOrderByRegDateAsc(String sender1, String receiver1, String sender2, String receiver2);

    List<ChatEntity> findByChatRoom(ChatRoomEntity roomId);
}