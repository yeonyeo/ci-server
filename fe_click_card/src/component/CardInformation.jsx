import React from 'react';
import { useNavigate } from 'react-router-dom';
import './CardInformation.css';

export default function CardInformation() {
    const navigate = useNavigate();

    return (
        <div className="container">
            <div className="innerContainer">
                <div className="nameContainer">
                    <h1 className="cardText">카드 상품</h1>
                </div>
                <div className="header">
                    <div className="cardImageContainer">
                        <img className="cardImage" src="https://via.placeholder.com/150x250" alt="Card" />
                    </div>
                    <div className="cardInformation">
                        <div className="cardContainer">
                            <h2 className="cardName">카드명</h2>
                            <p className="cardDescription">카드 설명</p>
                        </div>
                        <div className="cardBenefits">
                            <p className="cardBenefitsText">카드 혜택</p>
                        </div>
                    </div>
                </div>
                <div className="feeContainer">
                    <span className="feeText">연회비</span>
                    <input
                        className="feeInput"
                        value="50,000 원"
                        readOnly
                    />
                </div>
                <textarea
                    className="cardDetailDescription"
                    readOnly
                    value="카드 상세 설명"
                />
                <button className="applyButton" onClick={() => navigate('/create-card')}>
                    <span className="applyButtonText">신청하기</span>
                </button>
            </div>
        </div>
    );
}
