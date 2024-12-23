function solution(genres, plays) {
    const answer = [];
    const genreMap = new Map();
    const musicMap = new Map();
    
    genres.forEach((genre, idx) => {
        genreMap.set(genre, (genreMap.get(genre) || 0) + plays[idx]);
        musicMap.set(`${genre}-${idx}`, (musicMap.get(`${genre}-${idx}`) || 0) + plays[idx]);
    })
    
    const genreMapSorted = new Map([...genreMap.entries()].sort((a, b) => b[1] - a[1]));
    
    for([genre, playCnt] of genreMapSorted){
        const musicMapSortedByGenre = new Map([...musicMap.entries()]
                                              .filter((music) => music[0].includes(genre))
                                              .sort((a, b) => b[1] - a[1]));
        
        const musicTop2 = [...musicMapSortedByGenre.keys()]
            .slice(0, 2)
            .map((music) => Number(music.split('-')[1]));
        
        answer.push(...musicTop2);
    }
    
    return answer;
}