import React from 'react'
import {Button, Container, Table} from "react-bootstrap"
import Post from './Post';

function Table() {
  return (
    <Container >
    <section >
        <Table striped bordered hover >
            <thead >
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>내용</th>
                    <th>썸네일</th>
                    <th>작성일</th>
                    <th>삭제</th>
                </tr>
            </thead>
            <tbody id="tbody">
            {posts.map((post) => (
                <Post key={post.id} {...post}/>
            ))}
            </tbody>
        </Table>
    </section>

    <section>
        <div> 
        <Button variant="outline-success" size="lg" onClick={() => {
            navigate("/post");
        }}>글작성</Button>
        </div>
    </section>
    </Container>
  )
}

export default Table