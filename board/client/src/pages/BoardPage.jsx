import React, { useState, useEffect } from 'react'

import {useNavigate } from 'react-router-dom';

function BoardPage() {
    const [posts, setPosts] = useState([]);
    const navigate = useNavigate();

    const fetchPosts = async() => {
        const response = await fetch("http://localhost:3001/api/posts");
        const data = await response.json();
        console.log(data);
        setPosts(data);
    }
    useEffect(() => {
        fetchPosts();
    },[])
  return (
    <div>
        <header className='m-4'>
            <h1>게시판</h1>
        </header>
    <main>

    </main>
    </div>
  )
}

export default BoardPage