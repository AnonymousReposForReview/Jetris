package tests.javafuzzer2781;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:57:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1844763563992532644L;
    public static float fFld=0.122F;
    public byte byFld=118;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i7) {

        double d1=107.57194, d2=11.119035, dArr[]=new double[N];
        int i8=42, i9=-132, i10=8, i11=-11, i12=-19744, iArr1[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr1, 34894);
        FuzzerUtils.init(dArr, -75.76076);

        try {
            iArr1[(i7 >>> 1) % N] -= i7;
            for (d1 = 10; d1 < 174; ++d1) {
                for (i9 = (int)(d1); i9 < 10; i9++) {
                    d2 *= Test.instanceCount;
                    for (i11 = 1; i11 < 1; ++i11) {
                        Test.fFld -= (float)d2;
                        iArr1[(int)(d1 - 1)] += i9;
                        i10 += (((i11 * i10) + i10) - i9);
                        i10 -= (int)d2;
                    }
                    if (b) continue;
                    iArr1[(int)(d1)] += (int)Test.fFld;
                    i7 = i7;
                    if (b) continue;
                    Test.instanceCount += i10;
                }
            }
        }
        catch (ArithmeticException exc1) {
            dArr[(20630 >>> 1) % N] = -31401;
        }
        vMeth2_check_sum += i7 + Double.doubleToLongBits(d1) + i8 + i9 + i10 + Double.doubleToLongBits(d2) + i11 + i12
            + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1(long l, long l1) {

        int i13=-12432, i14=-42, i15=195, i16=-40045, i17=19991, i18=0;
        long l2=-8058070665283438490L;
        short s1=-17011;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.535F);

        vMeth2(i13);
        for (l2 = 3; l2 < 253; ++l2) {
            s1 += (short)(((l2 * i14) + i13) - i13);
            i13 += (int)(l2 * i13);
            s1 *= (short)Test.instanceCount;
            i14 = i14;
            for (i15 = 1; i15 < 7; i15++) {
                for (i17 = 1; i17 < 2; i17++) {
                    i16 <<= (int)3953241808L;
                    i14 += (i17 * i17);
                    i13 >>= -14;
                    fArr[i17] -= 33.910F;
                    i18 ^= i14;
                    Test.fFld += (i17 * l);
                    i14 = (int)l1;
                }
            }
        }
        vMeth1_check_sum += l + l1 + i13 + l2 + i14 + s1 + i15 + i16 + i17 + i18 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(double d) {

        int i2=1, i3=-10775, i4=33041, i5=-61028, i6=-45328, i19=6, iArr[][]=new int[N][N];
        short s=20142;
        float f=0.922F;
        boolean b1=false, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 117);
        FuzzerUtils.init(bArr, false);

        for (i2 = 11; i2 < 183; ++i2) {
            for (i4 = 1; 9 > i4; i4++) {
                Test.fFld *= (--s);
                for (f = i2; f < 2; f++) {
                    i6 = (--iArr[i2 + 1][i2]);
                }
                switch (((((int)(-(Test.fFld + i6))) >>> 1) % 5) + 22) {
                case 22:
                    if (b1) {
                    } else if (b1) {
                        Test.instanceCount += i4;
                        i5 -= (s++);
                        vMeth1(Test.instanceCount, Test.instanceCount);
                        i19 = 2;
                        do {
                            i3 >>= i3;
                            i6 ^= i6;
                            i6 %= (int)(s | 1);
                            i6 += i19;
                        } while (--i19 > 0);
                        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + s + Float.floatToIntBits(f)
                            + i6 + i19 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
                        return;
                    } else {
                        d *= f;
                    }
                    break;
                case 23:
                    bArr[i4 + 1] = b1;
                    break;
                case 24:
                    iArr[i2][i4] -= (int)-11774L;
                    break;
                case 25:
                case 26:
                    s = (short)i3;
                    break;
                default:
                    iArr[i4][i4 - 1] = s;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + s + Float.floatToIntBits(f) + i6 + i19 +
            (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-1219, i1=3, i20=12, i21=-13, i22=-48310, i23=72, i24=24121, iArr2[]=new int[N];
        double d3=-2.14398;
        long l3=2632282789L;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr2, -11);
        FuzzerUtils.init(sArr, (short)-32659);

        for (i = 5; i < 123; ++i) {
            vMeth(d3);
            i20 = 1;
            while (++i20 < 212) {
                for (l3 = 1; i20 < l3; l3 -= 3) {
                    Test.instanceCount |= i20;
                    iArr2[(int)(l3)] += 189;
                }
                i21 += (((i20 * i) + i20) - i20);
                i1 += (int)l3;
                i21 *= i20;
                i21 = (int)Test.instanceCount;
                Test.instanceCount += (i20 * l3);
                i21 -= (int)d3;
                sArr[i] = (short)i20;
                i1 = i1;
            }
            Test.instanceCount += i;
            Test.instanceCount -= i20;
            i1 = i;
            i22 = 1;
            do {
                Test.instanceCount = i22;
                i21 += (i22 ^ (long)Test.fFld);
                for (i23 = 1; i23 > i22; --i23) {
                    d3 = i20;
                    i1 = 129;
                    Test.fFld += (((i23 * Test.fFld) + i1) - i22);
                    Test.fFld *= i24;
                    i21 = -33547;
                }
                Test.instanceCount -= l3;
                byFld = (byte)d3;
                Test.fFld += Test.fFld;
                i1 -= i21;
            } while (++i22 < 212);
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
